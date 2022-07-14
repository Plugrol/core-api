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

package de.kissenpvp.api.config;

import de.kissenpvp.api.base.Implementation;
import de.kissenpvp.api.base.plugin.KissenPlugin;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Configuration extends Implementation
{
    default <T> T getSetting(Class<? extends Option<T>> clazz)
    {
        return getOption(clazz).getValue();
    }

    <T> Option<T> getOption(Class<? extends Option<T>> clazz);

    void registerOption(KissenPlugin kissenPlugin, Class<? extends Option<?>> optionNode);
}
