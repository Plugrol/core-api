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

package de.kissenpvp.api.networking.server;


import de.kissenpvp.api.networking.socket.DataPackage;

import java.io.IOException;
import java.net.Socket;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface SocketServerClient
{

    /**
     * Sends a data packet to this client.
     *
     * @param dataPackage the package to be sent.
     * @return whether the sending was successful or not.
     */
    DataPackage sendMessage(DataPackage dataPackage);

    /**
     * Stops the connection to this socket.
     *
     * @param reason The reason the server disconnects.
     * @throws IOException If the client is already closed or if it terminates unexpectedly.
     */
    void disconnect(String reason) throws IOException;

    String getID();

    Socket getSocket();

    String getGroup();

    void setGroup(String group);

    boolean isAlive();

    void setAlive(boolean alive);


}
