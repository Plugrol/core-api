package de.kissenpvp.api.message;

import de.kissenpvp.api.message.event.ChatClick;
import de.kissenpvp.api.message.event.ChatHover;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Message
{
    /**
     * Adds a new text passage.
     *
     * @param text       The text to be added.
     * @param hoverEvent What should happen when the player hovers over the passage with the mouse.
     * @param clickEvent What should happen, the player should press the text on it.
     */
    void attach(String text, ChatHover hoverEvent, ChatClick clickEvent);

    /**
     * Adds a new text passage.
     *
     * @param text       The text to be added.
     * @param hoverEvent What should happen when the player hovers over the passage with the mouse.
     */
    void attach(String text, ChatHover hoverEvent);

    /**
     * Adds a new text passage.
     *
     * @param text       The text to be added.
     * @param clickEvent What should happen, the player should press the text on it.
     */
    void attach(String text, ChatClick clickEvent);

    /**
     * Adds a new text passage.
     *
     * @param text The text to be added.
     */
    void attach(String text);

    /**
     * Adds a new messageBuilder passage.
     *
     * @param messageBuilder The messageBuilder to be added.
     */
    void attach(Message messageBuilder);

    /**
     * Adds a new messageBuilder passage.
     *
     * @param messageBuilder The messageBuilder to be added.
     */
    void attach(Message messageBuilder, ChatHover hoverEvent);

    /**
     * Adds a new messageBuilder passage.
     *
     * @param messageBuilder The messageBuilder to be added.
     */
    void attach(Message messageBuilder, ChatHover hoverEvent, ChatClick clickEvent);

    /**
     * Adds a new messageBuilder passage.
     *
     * @param messageBuilder The messageBuilder to be added.
     */
    void attach(Message messageBuilder, ChatClick clickEvent);

    /**
     * Adds a new messageBuilder passage.
     *
     * @param messageBuilder The messageBuilder to be added.
     */
    void attach(Message... messageBuilder);

    /**
     * Adds a new baseComponents passage.
     *
     * @param baseComponents The baseComponents to be added.
     */
    void attach(ChatComponent... baseComponents);

    /**
     * Creates the builder and now returns it.
     *
     * @return create the component builder.
     */
    ChatComponent[] create();

    /**
     * Empties the list of base components of this message builder.
     */
    void reset();

}
