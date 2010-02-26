package rhyskeepence.hazelcast.dequeuer;

import com.hazelcast.core.Hazelcast;
import rhyskeepence.hazelcast.common.Event;
import rhyskeepence.hazelcast.common.EventQueue;
import rhyskeepence.hazelcast.common.HazelcastDataNode;

public class EventDequeuer {

    public static void main(String... args) throws InterruptedException {

        final EventQueue eventQueue = new EventQueue(
                new HazelcastDataNode().<Event>getQueue("events")
        );

        int counter = 0;

        while (true) {
            eventQueue.waitForEvent();

            System.out.print("\r dequeued " + counter++ + " messages");

        }

    }

}
