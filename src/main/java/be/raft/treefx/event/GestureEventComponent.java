package be.raft.treefx.event;

import javafx.event.EventHandler;
import javafx.scene.input.RotateEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.input.SwipeEvent;
import javafx.scene.input.ZoomEvent;

/**
 * All JavaFx gesture events are listed here.
 * @param <T> Type for chaining functions.
 */
public interface GestureEventComponent<T extends GestureEventComponent<T>> {
    // Scrolling
    /**
     * Defines the handler to be called when a scrolling gesture is detected.
     */
    T onScrollStarted(EventHandler<? super ScrollEvent> handler);

    /**
     * Defines the handler to be called when user performs scrolling action.
     */
    T onScroll(EventHandler<? super ScrollEvent> handler);

    /**
     * Defines the handler to be called when a scrolling gesture ends.
     */
    T onScrollFinished(EventHandler<? super ScrollEvent> handler);

    // Rotating
    /**
     * Defines the handler to be called when a rotation gesture is detected.
     */
    T onRotationStarted(EventHandler<? super RotateEvent> handler);

    /**
     * Defines the handler to be called when user performs a rotation action.
     */
    T onRotate(EventHandler<? super RotateEvent> handler);

    /**
     * Defines the handler to be called when a rotation gesture ends.
     */
    T onRotationFinished(EventHandler<? super RotateEvent> handler);

    // Zooming

    /**
     * Defines the handler to be called when a zooming gesture is detected.
     */
    T onZoomStarted(EventHandler<? super ZoomEvent> handler);

    /**
     * Defines the handler to be called when user performs a zooming action.
     */
    T onZoom(EventHandler<? super ZoomEvent> handler);

    /**
     * Defines the handler to be called when a zooming gesture ends.
     */
    T onZoomFinished(EventHandler<? super ZoomEvent> handler);

    // Swipe

    /**
     * Defines the handler to be called when an upward swipe gesture
     * centered over this node happens.
     */
    T onSwipeUp(EventHandler<? super SwipeEvent> handler);

    /**
     * Defines the handler to be called when a downward swipe gesture
     * centered over this node happens.
     */
    T onSwipeDown(EventHandler<? super SwipeEvent> handler);

    /**
     * Defines the handler to be called when a leftward swipe gesture
     * centered over this node happens.
     */
    T onSwipeLeft(EventHandler<? super SwipeEvent> handler);

    /**
     * Defines the handler to be called when a rightward swipe gesture
     * centered over this node happens.
     */
    T onSwipeRight(EventHandler<? super SwipeEvent> handler);
}
