package be.raft.treefx.event;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;

/**
 * Defines a component as being able to handle events, this interface simply holds all available event components types.
 * @param <T> Type for chaining functions.
 */
public interface EventComponent<T extends EventComponent<T>> extends MouseEventComponent<T>, GestureEventComponent<T>,
        TouchEventComponent<T>, KeyBoardEventComponent<T>, InputEventComponent<T> {
    /**
     * Registers an event handler to this node. The handler is called when the
     * node receives an {@code Event} of the specified type during the bubbling
     * phase of event delivery.
     */
    <E extends Event> T addEventHandler(EventType<E> type, EventHandler<? super E> handler);

    /**
     * Registers an event filter to this node. The filter is called when the
     * node receives an {@code Event} of the specified type during the capturing
     * phase of event delivery.
     */
    <E extends Event> T addEventFilter(EventType<E> type, EventHandler<? super E> handler);
}
