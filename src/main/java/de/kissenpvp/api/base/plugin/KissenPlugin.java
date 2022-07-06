/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the GNU General Public
 * License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

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
