package be.raft.treefx.event;

import javafx.event.EventHandler;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;

/**
 * All JavaFx mouse events are listed here.
 * @param <T> Type for chaining functions.
 */
public interface MouseEventComponent<T extends MouseEventComponent<T>> {
    /**
     * Defines the handler to be called when a mouse button has been clicked
     * (Pressed and released) on this node.
     */
    T onMouseClick(EventHandler<? super MouseEvent> handler);

    /**
     * Defines the handler to be called when a mouse button is pressed on this {@code Node} and then dragged.
     */
    T onMouseDragged(EventHandler<? super MouseEvent> handler);

    /**
     * Defines the handler to be called when the mouse enters this {@code Node}.
     */
    T onMouseEntered(EventHandler<? super MouseEvent> handler);

    /**
     * Defines the handler to be called when the mouse exits this {@code Node}.
     */
    T onMouseExited(EventHandler<? super MouseEvent> handler);

    /**
     * Defines the handler to be called when the mouse moves within
     * this {@code Node} but no buttons has been pushed.
     */
    T onMouseMoved(EventHandler<? super MouseEvent> handler);

    /**
     * Defines the handler to be called when a mouse button has been pressed on this {@code Node}.
     */
    T onMousePressed(EventHandler<? super MouseEvent> handler);

    /**
     * Defines the handler to be called when a mouse button has been released on this {@code Node}.
     */
    T onMouseReleased(EventHandler<? super MouseEvent> handler);

    /**
     * Defines the handler to be called when a drag gesture has been detected.
     * This is the right place to start a drag and drop operation.
     */
    T onDragDetected(EventHandler<? super MouseEvent> handler);

    /**
     * Defines the handler to be called when a full press-drag-release gesture progresses within this {@code Node}.
     */
    T onDragOver(EventHandler<? super DragEvent> handler);

    /**
     * Defines the handler to be called when a full press-drag-release gesture enters this {@code Node}.
     */
    T onDragEntered(EventHandler<? super DragEvent> handler);

    /**
     * Defines the handler to be called when a full press-drag-release gesture enters this {@code Node}.
     */
    T onDragExited(EventHandler<? super DragEvent> handler);
}
