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

package de.kissenpvp.api.base.system;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface LogSystem
{
    /**
     * Sends a message to the console
     * for normal messaging.
     *
     * @param message The message to be sent.
     */
    void log(String message);

    /**
     * Sends a message to the console for error messaging.
     *
     * @param message   The message, that is attached to the error.
     * @param exception The error, that happens.
     */
    void error(String message, Exception exception);

    /**
     * Sends a message to the console for error messaging.
     * Which are only send, when debug is enabled.
     *
     * @param message   The message, that is attached to the error.
     * @param exception The error, that happens.
     */
    void debug(String message, Exception exception);


    /**
     * Sends a message to the console
     * for normal messaging.
     *
     * @param message The message to be sent.
     */
    void log(String message, String... prefixes);

    /**
     * Sends a message to the console for error messaging.
     *
     * @param message   The message, that is attached to the error.
     * @param exception The error, that happens.
     */
    void error(String message, Exception exception, String... prefixes);

    /**
     * Sends a message to the console for error messaging.
     * Which are only send, when debug is enabled.
     *
     * @param message   The message, that is attached to the error.
     * @param exception The error, that happens.
     */
    void debug(String message, Exception exception, String... prefixes);
}
