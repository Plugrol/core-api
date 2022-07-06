package de.kissenpvp.api.command;

import de.kissenpvp.api.base.plugin.KissenPlugin;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public record CommandDescriptor(CommandInfo commandInfo, KissenPlugin plugin, PluginCommand pluginCommand)
{
}
