package de.kissenpvp.api.networking.client;

import de.kissenpvp.api.networking.NetworkEntity;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public abstract class Client implements NetworkEntity
{

    @Override public final boolean isClient()
    {
        return true;
    }

    /**
     * @return Whether the client is connected or currently offline.
     */
    public abstract boolean isConnected ();
}
