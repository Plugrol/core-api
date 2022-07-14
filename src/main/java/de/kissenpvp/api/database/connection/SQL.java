/*
 *  Copyright 14.07.2022 KissenPvP
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
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
     * @return Whether the sql driver is set up.
     */
    boolean isConnected();



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
