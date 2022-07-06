package de.kissenpvp.api.base.plugin;

import de.kissenpvp.api.base.Implementation;

import java.io.File;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface KissenPlugin extends Implementation
{
    /**
     * Specification of the package in which the plugin has its commands, listener or messenger.
     *
     * @return the package this plugin has its executables.
     */
    String getPackage();

    /**
     * Is called as soon as the plugin is loaded.
     * This happens before all plugins are activated.
     */
    void onLoad();

    /**
     * Called when the server goes off.
     */
    void onDisable();

    /**
     * Is called as soon as the plugin is loaded.
     * This happens before all plugins are activated.
     */
    void onPreStart();

    /**
     * @return file of the plugin's jar
     */
    File getFile();

    /**
     * @return the folder containing plugin sources.
     */
    File getDataFolder();

    /**
     * Called when the plugin is activated.
     */
    void onStart();

    /**
     * Is called as soon as all plugins have been activated.
     */
    void onPostStart();

    /**
     * Called when the plugin is about to shut down.
     */
    void onStop();

    /**
     * Called after a plugin is loaded but before it has been enabled.
     * <p>
     * When multiple plugins are loaded, the onLoad() for all plugins is
     * called before any onEnable() is called.
     */
    void preStart();

    /**
     * Called when this plugin is enabled
     */
    void start();

    /**
     * This method is called after the start.
     */
    void postStart();

    /**
     * Called when this plugin is disabled
     */
    void stop();

    /**
     * indicates whether the system has started.
     *
     * @return Whether the system started.
     */
    boolean isStarted();

    /**
     * Returns an instance of the object.
     *
     * @return the object.
     */
    Object getInstance();
}
