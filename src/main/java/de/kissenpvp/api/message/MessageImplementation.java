/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the GNU General Public
 * License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

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
