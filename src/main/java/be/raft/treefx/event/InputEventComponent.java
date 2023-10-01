package be.raft.treefx.event;

import javafx.event.EventHandler;
import javafx.scene.input.InputMethodEvent;

/**
 * All JavaFx input method events are listed here.
 * @param <T> Type for chaining functions.
 */
public interface InputEventComponent<T extends InputEventComponent<T>> {
    /**
     * Defines the handler to be called when this {@code Node}
     * has input focus and the input method text has changed.  If this
     * function is not defined in this {@code Node}, then it
     * receives the result string of the input method composition as a
     * series of {@code onKeyTyped} function calls.
     */
    T onInputMethodTextChanged(EventHandler<? super InputMethodEvent> handler);
}
