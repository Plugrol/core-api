package de.kissenpvp.api.networking;

import java.io.IOException;
import java.net.InetAddress;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface NetworkEntity
{
    /**
     * @return The port this server is running on.
     */
    int getPort() throws IOException;

    /**
     * @return The interface to java which provides a {@link InetAddress}
     */
    InetAddress getInetAddress() throws IOException;

    /**
     * @return Whether this is a client or a server.
     */
    boolean isClient();
}
