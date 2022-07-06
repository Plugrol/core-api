package de.kissenpvp.api.networking.server;

import de.kissenpvp.api.networking.NetworkEntity;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public abstract class Server implements NetworkEntity
{
    @Override public final boolean isClient()
    {
        return false;
    }
}
