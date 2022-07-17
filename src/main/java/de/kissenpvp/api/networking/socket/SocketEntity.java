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
