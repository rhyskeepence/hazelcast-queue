package rhyskeepence.hazelcast.common;

import java.util.concurrent.BlockingQueue;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.IQueue;

public class EventQueue {
    final BlockingQueue<Event> eventQueue;

    public EventQueue(final BlockingQueue<Event> queue) {
        this.eventQueue = queue;
    }

    public Event waitForEvent() throws InterruptedException {
        return this.eventQueue.take();
    }

    public void put(Event event) throws InterruptedException {
        this.eventQueue.put(event);
    }

}
