package rhyskeepence.hazelcast.common;

import com.hazelcast.core.IQueue;

public class HazelcastDataNode implements Hazelcast {
    public <E> IQueue<E> getQueue(String name) {
        return com.hazelcast.core.Hazelcast.getQueue(name);
    }
}
