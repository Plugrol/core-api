package de.kissenpvp.api.message;

import de.kissenpvp.api.message.event.ChatClick;
import de.kissenpvp.api.message.event.ChatHover;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ChatComponent extends ChatMessage
{

    /**
     * Returns what will happen, when the message is hovered.
     *
     * @return the event, that'll be executed.
     */
    default ChatHover getHover()
    {
        return null;
    }

    /**
     * Returns what will happen, when the message is clicked.
     *
     * @return the event, that'll be executed.
     */
    default ChatClick getClick()
    {
        return null;
    }

}
