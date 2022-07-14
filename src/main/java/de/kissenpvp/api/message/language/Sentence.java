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
