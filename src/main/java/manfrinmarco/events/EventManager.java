package manfrinmarco.events;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private final List<EventListener> listeners = new ArrayList<>();

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void notify(GameEvent event) {
        for (EventListener listener : listeners) {
            listener.onEvent(event);
        }
    }
}