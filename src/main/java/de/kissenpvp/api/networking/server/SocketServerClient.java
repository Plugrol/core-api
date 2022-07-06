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
