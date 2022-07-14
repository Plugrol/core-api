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

package de.kissenpvp.api.message;

import de.kissenpvp.api.message.language.Languages;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Messages extends Languages
{
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
