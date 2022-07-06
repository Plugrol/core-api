package de.kissenpvp.api.config;

import de.kissenpvp.api.base.Implementation;
import de.kissenpvp.api.base.plugin.KissenPlugin;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ConfigurationImplementation extends Implementation
{
    default <T> T getSetting(Class<? extends Option<T>> clazz)
    {
        return getOption(clazz).getValue();
    }

    <T> Option<T> getOption(Class<? extends Option<T>> clazz);

    void registerOption(KissenPlugin kissenPlugin, Class<? extends Option<?>> optionNode);
}
