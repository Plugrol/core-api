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
    void log(String message, Exception exception);

    /**
     * Sends a message to the console for error messaging.
     * Which are only send, when debug is enabled.
     *
     * @param message   The message, that is attached to the error.
     * @param exception The error, that happens.
     */
    void debug(String message, Exception exception);
}
