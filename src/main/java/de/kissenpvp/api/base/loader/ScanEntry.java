package de.kissenpvp.api.base.loader;

import de.kissenpvp.api.base.plugin.KissenPlugin;

import java.util.jar.JarFile;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public record ScanEntry(JarFile jarFile, KissenPlugin kissenPlugin, String path)
{
}
