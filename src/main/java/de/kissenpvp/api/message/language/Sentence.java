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

package de.kissenpvp.api.message.language;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Sentence
{

    /**
     * This indicates whether the message in the language file should be written together with other messages.
     * If you want to use the error- or event-prefix instead of the normal one, include error or event here. Error is more important than event.
     *
     * @return The group this is in or null.
     */
    String getGroup();

    /**
     * Specifies the identification code of the message so that it can be called up in the config.
     *
     * @return The code to identify the message.
     */
    String getCode();

    /**
     * The type this message should be formatted.
     * The available types are: normal, error and event.
     *
     * @return The type that the message is using.
     */
    MessageType getType();

    /**
     * This method replaces the variables in the message.
     *
     * @param message The message in the used language.
     * @return The string with the replaced variables.
     */
    String replace(String message);

    /**
     * Provides the message in its original "English" form.
     *
     * @return The standard message in English.
     */
    String getDefault();

    /**
     * The type of prefix to put in front.
     *
     * @author groldi
     */
    enum MessageType
    {
        NORMAL,
        ERROR,
        EVENT,
        TEAM,
        SUPPORT,
        NO_PREFIX
    }
}
