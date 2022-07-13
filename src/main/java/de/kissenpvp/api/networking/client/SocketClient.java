/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the Apache
 * License as published by the Apache Software Foundation,
 * either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the Apache License for more details.
 *
 * You should have received a copy of the Apache License
 * along with this program. If not, see <https://www.apache.org/licenses/LICENSE-2.0>.
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
