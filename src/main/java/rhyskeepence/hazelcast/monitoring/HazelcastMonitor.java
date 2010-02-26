package rhyskeepence.hazelcast.monitoring;

import com.hazelcast.core.Cluster;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.Member;
import com.hazelcast.core.MembershipEvent;
import com.hazelcast.core.MembershipListener;

public class HazelcastMonitor {

    public static void main(String[] args) {

        final Cluster cluster = Hazelcast.getCluster();

        cluster.addMembershipListener(new MembershipListener() {
            public void memberAdded(MembershipEvent membersipEvent) {
                System.out.println("Cluster Member Added " + membersipEvent);
            }

            public void memberRemoved(MembershipEvent membersipEvent) {
                System.out.println("Cluster Member Removed " + membersipEvent);
            }
        });

        Member localMember = cluster.getLocalMember();
        System.out.println("this member = " + localMember.getInetSocketAddress());

    }

}
