/*
 *  Copyright 14.07.2022 KissenPvP
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
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

    String getName();

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
