package de.kissenpvp.api.message;

import de.kissenpvp.api.base.Implementation;
import de.kissenpvp.api.message.language.Sentence;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface MessageImplementation extends Implementation
{
    /**
     * A message in a specific language. This message will be adjusted to the plugins default, which includes adding a prefix and a color.
     *
     * @param language this should be in.
     * @param sentence which is sent returned.
     * @return A chat component which contains the message.
     * @see #getRawMessage(String, Sentence)
     */
    ChatComponent getMessage(String language, Sentence sentence);

    /**
     * A raw message is the message in the given language but without any replacements, except for the variables, which means no prefix and colors.
     * If the colors and prefix should be set automatically you should use {@link #getMessage(String, Sentence)}
     *
     * @param language this should be in.
     * @param sentence which is sent returned.
     * @return A chat component which contains the message.
     * @see #getMessage(String, Sentence)
     */
    ChatComponent getRawMessage(String language, Sentence sentence);
    
    void registerSentence(Sentence sentence);

    default String getLastColorCode(ChatComponent chatComponent)
    {
        return getLastColorCode(chatComponent.getText());
    }

    String getLastColorCode(String message);

    String toTime(long milliseconds);

    String getSeparator(String content);

    String getKey(String key, String value);

    int count(String input, String searchFor);
}
