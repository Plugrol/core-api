package de.kissenpvp.api.message.event;

import de.kissenpvp.api.message.ChatMessage;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ChatHover extends ChatMessage
{

    /**
     * What will happen.
     * You can read more at the referring class {@link ChatClickAction}
     *
     * @return the action to execute
     */
    ChatHoverAction getAction();

}
