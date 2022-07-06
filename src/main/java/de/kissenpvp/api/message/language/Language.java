package de.kissenpvp.api.message.language;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Language
{
    /**
     * Get some important information about a language, such as name and code
     * for more info go read {@link LanguageMetaNode}
     *
     * @return the meta of the language.
     */
    LanguageMetaNode getLanguageMeta();

    /**
     * Public method to get a sentence from this language.
     *
     * @param code The code of the message.
     * @return The message which has the code. {@code null} if there is no such message.
     */
    String getSentence(String code);
}
