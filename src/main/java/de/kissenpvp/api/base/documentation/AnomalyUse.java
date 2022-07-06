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