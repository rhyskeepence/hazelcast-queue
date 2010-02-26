package rhyskeepence.hazelcast.common;

import com.hazelcast.core.IQueue;

public class HazelcastClient implements Hazelcast {

    public <E> IQueue<E> getQueue(String name) {
        return defaultClient().getQueue(name);
    }

    private com.hazelcast.client.HazelcastClient defaultClient() {
        return com.hazelcast.client.HazelcastClient.newHazelcastClient("dev", "dev-pass", "10.0.0.5", "10.0.0.7");
    }
}
