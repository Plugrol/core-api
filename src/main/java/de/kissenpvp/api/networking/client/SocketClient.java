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

package de.kissenpvp.api.networking.client;

import de.kissenpvp.api.networking.socket.DataPackage;
import de.kissenpvp.api.networking.socket.SocketEntity;


/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public abstract class SocketClient extends Client implements SocketEntity
{

    public abstract String getID();

    public abstract String getGroup();

    public abstract int getTimeout();

    public abstract void setTimeout(int timeout);

    @Override public void start ()
    {
        this.start (new Object[0]);
    }

    /**
     * Starts the client and connects to the server.
     *
     * @param data these are additional dataset, which are sent when the client's connection to the server.
     */
    public abstract void start (Object... data);


    /**
     * Checks whether the server can be reached and sends back true or false accordingly.
     *
     * @return Whether the server is reachable.
     */
    public abstract boolean testConnection ();

    /**
     * sends a message from the client to the server that is currently connected.
     * If there is no connection, an attempt is made to establish one.
     *
     * @param dataPackage The message to be sent.
     * @return The response from the server.
     */
    public abstract DataPackage sendMessage (DataPackage dataPackage);

}
