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

package de.kissenpvp.api.base.documentation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
@Target({ ElementType.CONSTRUCTOR, ElementType.TYPE, ElementType.METHOD }) public @interface AnomalyUse
{
    /**
     * @return The description, why it is anomaly to use this thing.
     */
    String value() default "No description";
}