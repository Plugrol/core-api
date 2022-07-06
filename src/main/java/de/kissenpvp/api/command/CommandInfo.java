package de.kissenpvp.api.command;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public record CommandInfo(String command, String description, String[] usage, String[] alias, boolean consoleAllowed)
{
}
