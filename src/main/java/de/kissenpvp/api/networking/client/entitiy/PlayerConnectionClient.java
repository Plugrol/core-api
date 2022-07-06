package de.kissenpvp.api.networking.client.entitiy;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface PlayerConnectionClient
{
    JsonObject getData() throws JsonIOException;

    String getCountryCode();

    boolean hasVPN();
}
