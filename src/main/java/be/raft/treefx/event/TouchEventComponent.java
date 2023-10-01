package be.raft.treefx.event;

import javafx.event.EventHandler;
import javafx.scene.input.TouchEvent;

/**
 * All JavaFx touch events are listed here.
 * @param <T> Type for chaining functions.
 */
public interface TouchEventComponent<T extends TouchEventComponent<T>> {
    /**
     * Defines the handler to be called when a new touch point is pressed.
     */
    T onTouchPressed(EventHandler<? super TouchEvent> handler);

    /**
     * Defines the handler to be called when a touch point is moved.
     */
    T onTouchMoved(EventHandler<? super TouchEvent> handler);

    /**
     * Defines the handler to be called when touch point is released.
     */
    T onTouchReleased(EventHandler<? super TouchEvent> handler);

    /**
     * Defines the handler to be called when a touch point stays pressed and still.
     */
    T onTouchStationary(EventHandler<? super TouchEvent> handler);
}
