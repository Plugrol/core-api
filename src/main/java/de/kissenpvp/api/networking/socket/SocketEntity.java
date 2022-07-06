package de.kissenpvp.api.networking.socket;

import java.net.Socket;
import java.util.Map;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface SocketEntity
{
    /**
     * Executes a {@link Execution}. This execution has to be registered beforehand with <br>{@code #addExecution(String, Execution)}.
     *
     * @param dataPackage The data sent to the server.
     * @param tempSocket  The socket the message is coming from.
     */
    void execute(DataPackage dataPackage, Socket tempSocket);

    /**
     * A standard method of adding executions, which must always be there.
     */
    void insertExecutions();

    /**
     * Adds a new {@link Execution} to the connector.
     *
     * @param id        The ID with which this execution is triggered.
     * @param execution The code to be executed.
     */
    void addExecution(String id, Execution execution);

    /**
     * Is called as soon as a client connects.
     *
     * @param execution The code to be executed.
     */
    void onClientConnect(Execution execution);

    /**
     * Is called as soon as a client disconnects.
     *
     * @param execution The code to be executed.
     */
    void onClientDisconnect(Execution execution);

    Map<String, Execution> getExecutions();

    Socket getSocket();

    /**
     * Starts the connector.
     */
    void start();

    /**
     * Whether the client is running right now.
     *
     * @return whether the client has been started before using {@link #start()}.
     */
    boolean isRunning();

    /**
     * Stops the connector.
     */
    void stop();
}
