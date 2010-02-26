package rhyskeepence.hazelcast.enqueuer;

import java.util.UUID;

import org.joda.time.DateTime;

import rhyskeepence.hazelcast.common.Event;
import rhyskeepence.hazelcast.common.EventQueue;
import rhyskeepence.hazelcast.common.HazelcastClient;

public class EventEnqueuer {

    public static void main(String[] args) throws InterruptedException {

        final EventQueue eventQueue = new EventQueue(
                new HazelcastClient().<Event>getQueue("events")
        );

        System.out.println("starting enqueue at " + new DateTime());
        int i = 0;

        while (true) {

            eventQueue.put(new Event(UUID.randomUUID().toString()));

            System.out.printf("\rSent %d", i++);
        }

    }

}
