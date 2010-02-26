package rhyskeepence.hazelcast.common;

import com.hazelcast.core.IQueue;

public interface Hazelcast {

    <E> IQueue<E> getQueue(String name);

}
