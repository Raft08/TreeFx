package be.raft.treefx.event;

import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;

/**
 * All JavaFx keyboard events are listed here.
 * @param <T> Type for chaining functions.
 */
public interface KeyBoardEventComponent<T extends KeyBoardEventComponent<T>> {
    /**
     * Defines the handler to be called when this {@code Node} or its child
     * {@code Node} has input focus and a key has been pressed. The function
     * is called only if the event hasn't been already consumed during its
     * capturing or bubbling phase.
     */
    T onKeyPressed(EventHandler<? super KeyEvent> handler);

    /**
     * Defines the handler to be called when this {@code Node} or its child
     * {@code Node} has input focus and a key has been released. The function
     * is called only if the event hasn't been already consumed during its
     * capturing or bubbling phase.
     */
    T onKeyReleased(EventHandler<? super KeyEvent> handler);

    /**
     * Defines the handler to be called when this {@code Node} or its child
     * {@code Node} has input focus and a key has been typed. The function
     * is called only if the event hasn't been already consumed during its
     * capturing or bubbling phase.
     */
    T onKeyTyped(EventHandler<? super KeyEvent> handler);
}
