package de.kissenpvp.api.base.system;

import de.kissenpvp.api.command.CommandDescriptor;
import de.kissenpvp.api.networking.client.entitiy.ConnectionClient;
import de.kissenpvp.api.networking.socket.SocketEntity;

import java.util.List;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface System extends TaskSystem, EntitySystem, LogSystem
{

    /**
     * Interface for registering commands.
     * Here you can enter the information about a command and the system forwards this to the respective server system.
     *
     * @param commandDescriptor The command to be added.
     */
    void registerCommand(CommandDescriptor commandDescriptor);

    /**
     * Returns whether the passed class is a listener.
     *
     * @param clazz The class to be checked.
     * @return Whether it's a listener.
     */
    boolean isListener(Class<?> clazz);

    /**
     * Interface for registering listener.
     * Here you can enter the information about a listener and the system forwards this to the respective server system.
     *
     * @param listener The listener to be added.
     * @param plugin   The plugin that registers the listener.
     */
    void registerListener(Object listener, Object plugin);

    /**
     * Returns the port on which the server is running.
     *
     * @return the port of the server.
     */
    int getPort();

    /**
     * Returns the networking client of the server. Which can be a {@link de.kissenpvp.api.networking.client.SocketClient} or a {@link de.kissenpvp.api.networking.server.SocketServer} depending on whether this is the spigot or the proxy server.
     *
     * @return the connection client.
     */
    SocketEntity getSocketEntity();

    void localCallbackModifier(String command, String usage, List<String> callBack, ConnectionClient<?> connectionClient);

}
