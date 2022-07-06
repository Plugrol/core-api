package de.kissenpvp.api.networking.socket;


import java.net.Socket;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Execution
{

    /**
     * Is called when the specified ID is sent and the given code is executed.
     *
     * @param dataPackage The packet that is sent as {@link DataPackage}.
     * @param client      The client that sent the package.
     */
    void execute(DataPackage dataPackage, Socket client);

}
