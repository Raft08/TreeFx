package be.raft.treefx;

import java.util.List;
import java.util.function.Consumer;

public interface StyleComponent<T> {
    T setId(String id);
    T addStyleClass(String styleClass);
    List<String> getStyleClass();
    T buildStyle(Consumer<List<String>> styleBuilder);
}
