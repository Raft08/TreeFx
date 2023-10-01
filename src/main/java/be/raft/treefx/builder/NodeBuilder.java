package be.raft.treefx.builder;

import be.raft.treefx.StyleComponent;
import be.raft.treefx.event.EventComponent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.input.*;

import java.util.List;
import java.util.function.Consumer;

public class NodeBuilder implements StyleComponent<NodeBuilder>, EventComponent<NodeBuilder> {
    private final Node component;

    public NodeBuilder(Node component) {
        this.component = component;
    }

    // Styling
    @Override
    public NodeBuilder setId(String id) {
        this.component.setId(id);
        return this;
    }

    @Override
    public NodeBuilder addStyleClass(String styleClass) {
        this.component.getStyleClass().add(styleClass);
        return this;
    }

    @Override
    public List<String> getStyleClass() {
        return this.component.getStyleClass();
    }

    @Override
    public NodeBuilder buildStyle(Consumer<List<String>> styleBuilder) {
        styleBuilder.accept(this.getStyleClass());
        return this;
    }

    @Override
    public NodeBuilder onMouseClick(EventHandler<? super MouseEvent> handler) {
        this.component.setOnMouseClicked(handler);
        return this;
    }

    @Override
    public NodeBuilder onMouseDragged(EventHandler<? super MouseEvent> handler) {
        this.component.setOnMouseDragged(handler);
        return this;
    }

    @Override
    public NodeBuilder onMouseEntered(EventHandler<? super MouseEvent> handler) {
        this.component.setOnMouseEntered(handler);
        return this;
    }

    @Override
    public NodeBuilder onMouseExited(EventHandler<? super MouseEvent> handler) {
        this.component.setOnMouseExited(handler);
        return this;
    }

    @Override
    public NodeBuilder onMouseMoved(EventHandler<? super MouseEvent> handler) {
        this.component.setOnMouseMoved(handler);
        return this;
    }

    @Override
    public NodeBuilder onMousePressed(EventHandler<? super MouseEvent> handler) {
        this.component.setOnMousePressed(handler);
        return this;
    }

    @Override
    public NodeBuilder onMouseReleased(EventHandler<? super MouseEvent> handler) {
        this.component.setOnMouseReleased(handler);
        return this;
    }

    @Override
    public NodeBuilder onDragDetected(EventHandler<? super MouseEvent> handler) {
        this.component.setOnDragDetected(handler);
        return this;
    }

    @Override
    public NodeBuilder onDragOver(EventHandler<? super DragEvent> handler) {
        this.component.setOnDragOver(handler);
        return this;
    }

    @Override
    public NodeBuilder onDragEntered(EventHandler<? super DragEvent> handler) {
        this.component.setOnDragEntered(handler);
        return this;
    }

    @Override
    public NodeBuilder onDragExited(EventHandler<? super DragEvent> handler) {
        this.component.setOnDragExited(handler);
        return this;
    }

    @Override
    public <E extends Event> NodeBuilder addEventHandler(EventType<E> type, EventHandler<? super E> handler) {
        this.component.addEventHandler(type, handler);
        return this;
    }

    @Override
    public <E extends Event> NodeBuilder addEventFilter(EventType<E> type, EventHandler<? super E> handler) {
        this.component.addEventFilter(type, handler);
        return this;
    }

    @Override
    public NodeBuilder onScrollStarted(EventHandler<? super ScrollEvent> handler) {
        this.component.setOnScrollStarted(handler);
        return this;
    }

    @Override
    public NodeBuilder onScroll(EventHandler<? super ScrollEvent> handler) {
        this.component.setOnScroll(handler);
        return this;
    }

    @Override
    public NodeBuilder onScrollFinished(EventHandler<? super ScrollEvent> handler) {
        this.component.setOnScrollFinished(handler);
        return this;
    }

    @Override
    public NodeBuilder onRotationStarted(EventHandler<? super RotateEvent> handler) {
        this.component.setOnRotationStarted(handler);
        return this;
    }

    @Override
    public NodeBuilder onRotate(EventHandler<? super RotateEvent> handler) {
        this.component.setOnRotate(handler);
        return this;
    }

    @Override
    public NodeBuilder onRotationFinished(EventHandler<? super RotateEvent> handler) {
        this.component.setOnRotationFinished(handler);
        return this;
    }

    @Override
    public NodeBuilder onZoomStarted(EventHandler<? super ZoomEvent> handler) {
        this.component.setOnZoomStarted(handler);
        return this;
    }

    @Override
    public NodeBuilder onZoom(EventHandler<? super ZoomEvent> handler) {
        this.component.setOnZoom(handler);
        return this;
    }

    @Override
    public NodeBuilder onZoomFinished(EventHandler<? super ZoomEvent> handler) {
        this.component.setOnZoomFinished(handler);
        return this;
    }

    @Override
    public NodeBuilder onSwipeUp(EventHandler<? super SwipeEvent> handler) {
        this.component.setOnSwipeUp(handler);
        return this;
    }

    @Override
    public NodeBuilder onSwipeDown(EventHandler<? super SwipeEvent> handler) {
        this.component.setOnSwipeDown(handler);
        return this;
    }

    @Override
    public NodeBuilder onSwipeLeft(EventHandler<? super SwipeEvent> handler) {
        this.component.setOnSwipeLeft(handler);
        return this;
    }

    @Override
    public NodeBuilder onSwipeRight(EventHandler<? super SwipeEvent> handler) {
        this.component.setOnSwipeRight(handler);
        return this;
    }

    @Override
    public NodeBuilder onInputMethodTextChanged(EventHandler<? super InputMethodEvent> handler) {
        this.component.setOnInputMethodTextChanged(handler);
        return this;
    }

    @Override
    public NodeBuilder onKeyPressed(EventHandler<? super KeyEvent> handler) {
        this.component.setOnKeyPressed(handler);
        return this;
    }

    @Override
    public NodeBuilder onKeyReleased(EventHandler<? super KeyEvent> handler) {
        this.component.setOnKeyReleased(handler);
        return this;
    }

    @Override
    public NodeBuilder onKeyTyped(EventHandler<? super KeyEvent> handler) {
        this.component.setOnKeyTyped(handler);
        return this;
    }

    @Override
    public NodeBuilder onTouchPressed(EventHandler<? super TouchEvent> handler) {
        this.component.setOnTouchPressed(handler);
        return this;
    }

    @Override
    public NodeBuilder onTouchMoved(EventHandler<? super TouchEvent> handler) {
        this.component.setOnTouchMoved(handler);
        return this;
    }

    @Override
    public NodeBuilder onTouchReleased(EventHandler<? super TouchEvent> handler) {
        this.component.setOnTouchReleased(handler);
        return this;
    }

    @Override
    public NodeBuilder onTouchStationary(EventHandler<? super TouchEvent> handler) {
        this.component.setOnTouchStationary(handler);
        return this;
    }
}
