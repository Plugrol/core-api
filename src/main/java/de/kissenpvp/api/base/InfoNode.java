package de.kissenpvp.api.base;

import de.kissenpvp.api.base.plugin.KissenPlugin;
import de.kissenpvp.api.base.system.ProxySystem;

import java.io.File;
import java.util.jar.JarFile;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public record InfoNode(JarFile pluginSourceFile, File dataFolder, KissenPlugin plugin, System system, boolean isMySQL,
                       boolean hasEnabledBungeecord)
{
    public boolean isProxy()
    {
        return system instanceof ProxySystem;
    }

    public boolean isLeadingServer()
    {
        return !hasEnabledBungeecord || isProxy();
    }

    public File getConfigFile()
    {
        return new File(dataFolder + "/config.yml");
    }
}
