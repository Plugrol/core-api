/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the Apache
 * License as published by the Apache Software Foundation,
 * either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the Apache License for more details.
 *
 * You should have received a copy of the Apache License
 * along with this program. If not, see <https://www.apache.org/licenses/LICENSE-2.0>.
 */

package de.kissenpvp.api.base.plugin;

import de.kissenpvp.api.base.Implementation;
import de.kissenpvp.api.base.Kissen;

import java.io.File;
import java.io.IOException;
import java.util.jar.JarFile;

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
     * @return file of the plugin's jar
     */
    File getFile();

    /**
     * @return file of the plugin's jar as {@link java.util.jar.JarFile}
     */
    JarFile getJarFile() throws IOException;

    /**
     * @return the folder containing plugin sources.
     */
    File getFolder();

    /**
     * Is called as soon as the plugin is loaded.
     * This happens before all plugins are activated.
     */
    boolean onPreStart();

    /**
     * Called when the plugin is activated.
     */
    boolean onStart();

    /**
     * Is called as soon as all plugins have been activated.
     */
    boolean onPostStart();

    /**
     * Called when the plugin is about to shut down.
     */
    void onStop();

    /**
     * Called when the server goes off.
     */
    void onDisable();

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
    KissenPlugin getInstance();

    Kissen getCore();
}
