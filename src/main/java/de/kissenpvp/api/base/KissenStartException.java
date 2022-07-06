package de.kissenpvp.api.base;

/**
 * Is thrown when something went wrong while starting the kissen system.
 * This contains a cause, which is the exception that was thrown when starting.
 *
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public class KissenStartException extends Exception
{

    /**
     * Acts as a container for walking through exceptions, which were caused while starting the system.
     *
     * @param message the message, why the plugin failed to start.
     * @param cause   the exception, which was thrown.
     */
    public KissenStartException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
