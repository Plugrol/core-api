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
