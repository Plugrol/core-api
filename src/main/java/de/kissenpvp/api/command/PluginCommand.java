package de.kissenpvp.api.command;

import de.kissenpvp.api.networking.client.entitiy.ConnectionClient;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public abstract class PluginCommand
{
    /**
     * This method is executed when a command is executed.
     *
     * @param sender The sender of the command as object to keep it compatible with both.
     * @param args   The arguments, that the sender gave.
     */
    protected abstract void execute(ExecutableCommand command, ConnectionClient<?> sender, String[] args);
}
