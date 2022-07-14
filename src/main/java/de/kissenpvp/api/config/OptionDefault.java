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

import de.kissenpvp.api.base.Kissen;
import de.kissenpvp.api.base.documentation.AnomalyUse;
import de.kissenpvp.api.database.file.File;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public abstract class OptionDefault<T> implements Option<T>
{
    private T value;

    @Override public int getPriority()
    {
        return 0;
    }

    @Override public T getValue()
    {
        return value == null ? getDefault() : value;
    }

    @Override public void setValue(T value)
    {
        this.value = value;
    }

    @Override @AnomalyUse(value = "This is very dangerous since it only works, when invoking the exact same type as the option has to be.") public void setUnsafe(Object value) throws ClassCastException
    {
        setValue((T) value);
    }

    @Override public void override(T value, File file)
    {
        setValue(value);
        file.write(getCode(), value, getDescription());
    }

    private T cast(Object object)
    {
        final T DEFAULT_TYPE_DESCRIPTION = this.getDefault();
        try
        {
            if (DEFAULT_TYPE_DESCRIPTION.getClass().getSimpleName().equals("String"))
            {
                //String does not have a method String.valueOf(String); ._.
                return (T) object;
            }
            else
            {
                //Cannot be another thing, it's just an instance of T
                return (T) DEFAULT_TYPE_DESCRIPTION.getClass().getMethod("valueOf", String.class).invoke(null, object.toString());
            }
        }
        catch (Exception exception)
        {
            Kissen.getInstance().getInternals().system().error("An error occurred while trying to convert unknown value to " + DEFAULT_TYPE_DESCRIPTION.getClass().getSimpleName(), exception);
        }
        return null;
    }
}
