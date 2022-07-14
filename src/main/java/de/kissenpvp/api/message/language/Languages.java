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

package de.kissenpvp.api.message.language;

import de.kissenpvp.api.base.Implementation;
import de.kissenpvp.api.base.plugin.KissenPlugin;
import de.kissenpvp.api.message.ChatComponent;

import java.util.List;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Languages extends Implementation
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

    /**
     * Registers a new sentence in the system.
     *
     * @param kissenPlugin the plugin to attach this {@link Sentence}
     * @param sentence     the sentence to add.
     */
    void registerSentence(KissenPlugin kissenPlugin, Sentence sentence);

    /**
     * Returns all sentences registered by the given plugin.
     *
     * @param kissenPlugin the plugin to attach this {@link Sentence}
     */
    List<Sentence> getSentences(KissenPlugin kissenPlugin);

}
