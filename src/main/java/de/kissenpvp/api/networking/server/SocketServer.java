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
import de.kissenpvp.api.networking.socket.SocketEntity;

import java.net.InetAddress;
import java.net.Socket;
import java.util.List;
import java.util.Set;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public abstract class SocketServer extends Server implements SocketEntity
{

    public abstract Set<SocketServerClient> getConnectedClients();

    public abstract int getInterval();

    /**
     * Changes the interval of the ping.
     *
     * @param interval The new interval in seconds.
     */
    public abstract void setInterval(int interval);


    /**
     * Disconnects from a complete group of clients.
     *
     * @param reason The reason the server disconnects.
     * @param group  The group whose clients should be truncated.
     * @return The clients that were removed.
     */
    public abstract int disconnect(String group, String reason);

    /**
     * Disconnects a client based on its id.
     *
     * @param reason The reason the server disconnects.
     * @param id     the ID of the client.
     * @return Whether the disconnect was carried out successfully.
     */
    public abstract boolean disconnectClient(String id, String reason);

    /**
     * Disconnects a client.
     *
     * @param reason             The reason the server disconnects.
     * @param socketServerClient the client that should be disconnected.
     * @return Whether the disconnect was carried out successfully.
     */
    public abstract boolean disconnectClient(SocketServerClient socketServerClient, String reason);

    /**
     * Sends a packet to all connected clients.
     *
     * @param dataPackage The package that every connected client should receive.
     * @return The count of clients receiving the package.
     */
    public abstract int broadcast(DataPackage dataPackage);

    /**
     * Sends a packet to all connected clients, which are in a specific group.
     *
     * @param group       The group that the client has to be in.
     * @param dataPackage The package that every connected client in that group should receive.
     * @return The count of clients receiving the package.
     */
    public abstract int broadcast(String group, DataPackage dataPackage);

    /**
     * Sends a message to a specific client based on its id.
     *
     * @param id          The id of the client.
     * @param dataPackage The packet to send.
     * @return Whether the sending was successful or not.
     */
    public abstract boolean sendMessage(String id, DataPackage dataPackage);

    /**
     * Sends a message to client.
     *
     * @param socketServerClient The client that should receive the message.
     * @param dataPackage        The packet to send.
     * @return Whether the sending was successful or not.
     */
    public abstract boolean sendMessage(SocketServerClient socketServerClient, DataPackage dataPackage);

    /**
     * Sends a message to given {@link SocketServerClient}, which is determined based on the ID.
     *
     * @param id          The id of the client to which the message should be sent.
     * @param dataPackage The packet to be sent to the client.
     * @return The {@link DataPackage} that the client sent in response.
     */
    public abstract DataPackage sendAnsweredMessage(String id, DataPackage dataPackage);

    /**
     * Sends a message to given {@link SocketServerClient}, which is determined based on the ID.
     *
     * @param socketServerClient The client to which the message should be sent.
     * @param dataPackage        The packet to be sent to the client.
     * @return The {@link DataPackage} that the client sent in response.
     */
    public abstract DataPackage sendAnsweredMessage(SocketServerClient socketServerClient, DataPackage dataPackage);

    /**
     * Returns an existing connection, which is specified as a {@link SocketServerClient}.
     *
     * @param id The ID of the client which will be returned.
     * @return The client with the given ID.
     */
    public abstract SocketServerClient getClient(String id);

    /**
     * Returns an existing connection, which is specified as a {@link SocketServerClient}.
     *
     * @param socket The connection interface to java.
     * @return The SocketServerClient that is connected.
     */
    public abstract SocketServerClient getClient(Socket socket);

    /**
     * Returns an existing connection, which is specified as a {@link SocketServerClient}.
     *
     * @param inetAddress The connection interface to java.
     * @return The SocketServerClient that is connected.
     */
    public abstract SocketServerClient getClient(InetAddress inetAddress);

    /**
     * Returns an existing connections, which are specified as {@link SocketServerClient}s.
     *
     * @param group The group which are the clients should be in.
     * @return The client which are in the given group.
     */
    public abstract List<SocketServerClient> getClients(String group);

}
