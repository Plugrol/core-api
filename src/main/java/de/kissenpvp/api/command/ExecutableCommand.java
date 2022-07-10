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

package de.kissenpvp.api.command;

import de.kissenpvp.api.message.ChatComponent;
import de.kissenpvp.api.message.Message;
import de.kissenpvp.api.message.language.Sentence;
import de.kissenpvp.api.networking.client.entitiy.ConnectionClient;
import de.kissenpvp.api.util.PageBuilder;

import java.util.function.Consumer;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ExecutableCommand
{

    CommandDescription getCommandDescription();

    void onCommand();

    /**
     * This method checks whether the sender is a player.
     *
     * @return whether the sender is a player or not.
     */
    boolean isPlayer();

    /**
     * This method checks whether the sender has the necessary permissions for something.
     *
     * @param permission The permission to be checked.
     * @return Whether the player has this permission, or not.
     */
    boolean hasPermission(String permission);

    /**
     * @param sentence The sentence you want to get.
     * @return The message from the sentence.
     */
    ChatComponent getMessage(Sentence sentence);

    /**
     * @param sentence The sentence you want to get.
     * @return The message from the sentence.
     */
    ChatComponent getRawMessage(Sentence sentence);

    String getAlias();

    String[] getArguments();

    /**
     * Sends a message to the player in the language the player's using.
     *
     * @param sentence The sentence that should be sent.
     */
    void sendMessage(Sentence sentence);

    /**
     * This method sends a message to the player via java reflection.
     *
     * @param message The message, that should be sent to the player.
     */
    void sendMessage(String message);

    /**
     * Sends multiple messages to the player or console at once.
     *
     * @param message The messages designed in {@link Message}.
     */
    void sendMessage(Message... message);

    /**
     * Sends a message to the player designed in a {@link ChatComponent}.
     *
     * @param message The message to send.
     */
    void sendMessage(ChatComponent... message);

    /**
     * Prints a view of entries in a page builder.
     * This prevents some common issues when using a page system such as the user giving a negative page number or a higher than it has.
     * Also, it can handle it, when there is no page given and just turn it to the first page. Therefor the {@link PageBuilder} is used to get the needed pages and determine how many entry one page has.
     *
     * @param args            given when executing the command. Those are needed to check the length and the page.
     * @param pageArgument    is the argument in the args which contains the page.
     * @param splitterContent the content of the visual splitter in the chat.
     * @param pageBuilder     itself containing the entries and manages the pages.
     * @param consumer        is the action executed for each and every entry on the current page.
     * @param <T>             the type of the entries of the {@link PageBuilder} which in the end leads to the type of the {@link Consumer} as well.
     */
    <T> void sendPage(String[] args, int pageArgument, String splitterContent, PageBuilder<T> pageBuilder, Consumer<T> consumer);

    /**
     * @return the sender of the command.
     */
    ConnectionClient<?> getSender();

    /**
     * Runs only when the sender got a specific permission.
     *
     * @param permission The permission.
     * @param runnable   The code to run.
     * @return Whether the user has the permission or not.
     */
    boolean run(String permission, Runnable runnable);

}
