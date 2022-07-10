/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the GNU General Public
 * License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package de.kissenpvp.api.database.connection;

import de.kissenpvp.api.base.Implementation;
import de.kissenpvp.api.base.documentation.AnomalyUse;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface SQL extends Implementation
{
    /**
     * Establishes a connection to the responsible driver.
     *
     * @throws SQLException is thrown when there is some kind of error while connection, like wrong login data or the server is offline.
     */
    void connect() throws SQLException;

    /**
     * Disconnects the connection between the java plugin and the sql source.
     */
    void disconnect();

    /**
     * @return Whether the sql driver is set up.
     */
    boolean isConnected();

    /**
     * This is a secure way, to get send a SQL command using a {@link PreparedStatement} which provides some extra security.
     * Unlike {@link Statement} this statement has implemented a separation of the query and the inputs.
     *
     * @param sql the query to send to the sql driver.
     * @return the created statement which can be executed afterwards.
     * @throws SQLException is thrown when the driver is not set or there was an error contacting the server.
     */
    default PreparedStatement getPreparedStatement(String sql) throws SQLException
    {
        return getPreparedStatement(sql, MySQLType.PUBLIC);
    }

    /**
     * This method can be pretty critical, since mysql is a real thing.
     * Anyway, sometimes this has to be used, but when there shouldn't be user input.
     * <p>
     * If you are a developer and want to do a safe implementation using raw SQL you could use the safer method {@link #getPreparedStatement(String)} which uses {@link PreparedStatement} which are much more secure.
     *
     * @return the {@link Statement} from the given driver.
     * @throws SQLException is thrown when the driver is not set or there was an error contacting the server.
     * @see #getPreparedStatement(String)
     */
    @AnomalyUse default Statement getStatement() throws SQLException
    {
        return getStatement(MySQLType.PUBLIC);
    }

    /**
     * This is a secure way, to get send a SQL command using a {@link PreparedStatement} which provides some extra security.
     * Unlike {@link Statement} this statement has implemented a separation of the query and the inputs.
     *
     * @param mySQLType the type of database to use. This is only important when using mysql, is sqlite in use this will be ignored.
     * @param sql       the query to send to the sql driver.
     * @return the created statement which can be executed afterwards.
     * @throws SQLException is thrown when the driver is not set or there was an error contacting the server.
     */
    PreparedStatement getPreparedStatement(String sql, MySQLType mySQLType) throws SQLException;

    /**
     * This method can be pretty critical, since mysql is a real thing.
     * Anyway, sometimes this has to be used, but when there shouldn't be user input.
     * <p>
     * If you are a developer and want to do a safe implementation using raw SQL you could use the safer method {@link #getPreparedStatement(String)} which uses {@link PreparedStatement} which are much more secure.
     *
     * @param mySQLType the type of database to use. This is only important when using mysql, is sqlite in use this will be ignored.
     * @return the {@link Statement} from the given driver.
     * @throws SQLException is thrown when the driver is not set or there was an error contacting the server.
     * @see #getPreparedStatement(String)
     */
    @AnomalyUse Statement getStatement(MySQLType mySQLType) throws SQLException;

    /**
     * Specifies the database to send the data to.
     * <p>
     * While public is a database used by all servers, for permissions ranks and so on, the private one contains stuff like spawn location and stats.
     *
     * @author groldi
     */
    enum MySQLType
    {
        PUBLIC, PRIVATE
    }
}
