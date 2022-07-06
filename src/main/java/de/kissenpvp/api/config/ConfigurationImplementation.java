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

package de.kissenpvp.api.config;

import de.kissenpvp.api.base.Implementation;
import de.kissenpvp.api.base.plugin.KissenPlugin;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface ConfigurationImplementation extends Implementation
{
    default <T> T getSetting(Class<? extends Option<T>> clazz)
    {
        return getOption(clazz).getValue();
    }

    <T> Option<T> getOption(Class<? extends Option<T>> clazz);

    void registerOption(KissenPlugin kissenPlugin, Class<? extends Option<?>> optionNode);
}
