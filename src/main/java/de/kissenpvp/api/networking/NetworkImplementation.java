package de.kissenpvp.api.networking;

import de.kissenpvp.api.base.Implementation;
import de.kissenpvp.api.networking.socket.DataPackage;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface NetworkImplementation extends Implementation
{

    DataPackage createPackage(String id, Object... data);

    void sendDataPackage(DataPackage dataPackage);

}
