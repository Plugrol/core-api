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
