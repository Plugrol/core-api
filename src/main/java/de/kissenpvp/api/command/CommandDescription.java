/*
 * KissenPvP
 * Copyright (C) KissenPvP team and contributors.
 *
 * This program is free software and is free to redistribute
 * and/or modify under the terms of the Apache
 * License as published by the Apache Software Foundation,
 * either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is intended for the purpose of joy,
 * WITHOUT WARRANTY without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the Apache License for more details.
 *
 * You should have received a copy of the Apache License
 * along with this program. If not, see <https://www.apache.org/licenses/LICENSE-2.0>.
 */

package de.kissenpvp.api.command;

import de.kissenpvp.api.base.plugin.KissenPlugin;
import de.kissenpvp.api.message.ChatComponent;
import de.kissenpvp.api.message.Message;
import de.kissenpvp.api.message.event.ChatClick;
import de.kissenpvp.api.message.event.ChatHover;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public record CommandDescription(Command commandInfo, String permission, KissenPlugin plugin,
                                 PluginCommand pluginCommand)
{

    public Message getHelp()
    {
        return new Message()
        {
            @Override public void attach(String text, ChatHover hoverEvent, ChatClick clickEvent)
            {

            }

            @Override public void attach(String text, ChatHover hoverEvent)
            {

            }

            @Override public void attach(String text, ChatClick clickEvent)
            {

            }

            @Override public void attach(String text)
            {

            }

            @Override public void attach(Message messageBuilder)
            {

            }

            @Override public void attach(Message messageBuilder, ChatHover hoverEvent)
            {

            }

            @Override public void attach(Message messageBuilder, ChatHover hoverEvent, ChatClick clickEvent)
            {

            }

            @Override public void attach(Message messageBuilder, ChatClick clickEvent)
            {

            }

            @Override public void attach(Message... messageBuilder)
            {

            }

            @Override public void attach(ChatComponent... baseComponents)
            {

            }

            @Override public ChatComponent[] create()
            {
                return new ChatComponent[0];
            }

            @Override public void reset()
            {

            }
        };
    }

}
