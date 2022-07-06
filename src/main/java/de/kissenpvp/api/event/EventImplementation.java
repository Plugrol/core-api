package de.kissenpvp.api.event;

import java.util.List;

/**
 * @author Groldi
 * @since 1.0.0-SNAPSHOT
 */
public interface EventImplementation
{

    /**
     * Returns the events that were registered to the list of the {@link ClassLoader}
     * These can be manually applied with the method {@link #register(EventListener)}.
     *
     * @return A list of all loaded events which is unmodifiable.
     */
    List<?> getEventListener();

    /**
     * Registers a new action to the event system, when a specific {@link Event} is triggered by {@link #call(Event)}.
     * <p>
     * This method is using reflection, which means many exceptions may appear. The most common is that the {@link ClassLoader} was not initialized yet.
     * <p>
     * Most likely there are no problems with using this method, but I would recommend using the classloader itself to register the events.
     *
     * @param eventListener The action, that should be applied, when triggering the event.
     */
    void register(EventListener<?> eventListener);

    /**
     * Triggers an {@link Event}.
     * Every {@link EventListener} which has the event as generic type, will be executed by this.
     * <p>
     * Due to java the event can't just parse to the generic type to call the method {@link EventListener#call(Event)}
     * which leads to a helper method {@link EventListener#callUnknown(Event)}.
     * <p>
     * This method throws an exception when the event is not the same as the generic type of the {@link EventListener}.
     *
     * @param event The event to be called.
     * @return Whether the event should be executed or not.
     * This can be only applied to events that implement from {@link Cancellable}. When that is not the case it'll return true.
     */
    boolean call(Event event);

}
