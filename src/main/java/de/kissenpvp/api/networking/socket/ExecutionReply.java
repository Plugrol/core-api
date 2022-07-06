package de.kissenpvp.api.networking.socket;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ExecutionReply extends Execution
{
    /**
     * This message is sent back to the client.
     *
     * @return The message to be sent back.
     */
    Object[] getResponse ();
}
