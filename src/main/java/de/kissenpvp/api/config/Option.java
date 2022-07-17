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

import de.kissenpvp.api.database.file.File;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface Option<T>
{

    /**
     * The path where it is stored in the file; here, too, one could speak of a jsonKey,
     * which, however, is only used in the file.
     *
     * @return The path, of the value in the file.
     */
    String getCode();

    /**
     * This value indicates the id of the option, which is decisive for the recognition.
     * In json, this value would be the key.
     *
     * @return The key of the option.
     */
    String getGroup();

    /**
     * A description of the setting, which explains what that setting does.
     *
     * @return The description of the setting
     */
    String getDescription();

    /**
     * Enter a priority here which is used for sorting.
     *
     * @return int char of the priority.
     */
    int getPriority();

    /**
     * The default value of the setting is returned here,
     * which is specified in the configuration file when it is started for the first time.
     *
     * @return The default worth this option.
     */
    T getDefault();

    /**
     * This method returns the current value of the
     * option and if it is not loaded, it is loaded.
     *
     * @return The current value of the option.
     */
    T getValue();

    /**
     * Here you convert the value of the option and
     * also save it in the configuration.
     *
     * @param value The new value of the variable, which is also set in the configuration.
     */
    void setValue(T value);

    /**
     * Here you convert the value of the option and
     * also save it in the configuration.
     *
     * @param value The new value of the variable, which is also set in the configuration.
     */
    void setUnsafe(Object value) throws ClassCastException;

    void override(T value, File file);
}
