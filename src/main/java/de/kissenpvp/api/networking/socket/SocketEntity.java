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

package de.kissenpvp.api.networking.socket;

import java.net.Socket;
import java.util.Map;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface SocketEntity
{
    /**
     * Executes a {@link Execution}. This execution has to be registered beforehand with <br>{@code #addExecution(String, Execution)}.
     *
     * @param dataPackage The data sent to the server.
     * @param tempSocket  The socket the message is coming from.
     */
    void execute(DataPackage dataPackage, Socket tempSocket);

    /**
     * A standard method of adding executions, which must always be there.
     */
    void insertExecutions();

    /**
     * Adds a new {@link Execution} to the connector.
     *
     * @param id        The ID with which this execution is triggered.
     * @param execution The code to be executed.
     */
    void addExecution(String id, Execution execution);

    /**
     * Is called as soon as a client connects.
     *
     * @param execution The code to be executed.
     */
    void onClientConnect(Execution execution);

    /**
     * Is called as soon as a client disconnects.
     *
     * @param execution The code to be executed.
     */
    void onClientDisconnect(Execution execution);

    Map<String, Execution> getExecutions();

    Socket getSocket();

    /**
     * Starts the connector.
     */
    void start();

    /**
     * Whether the client is running right now.
     *
     * @return whether the client has been started before using {@link #start()}.
     */
    boolean isRunning();

    /**
     * Stops the connector.
     */
    void stop();
}
