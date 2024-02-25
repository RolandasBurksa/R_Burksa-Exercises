package lt.voting.rolandas;

import lt.vtvpmc.java.voting.AbstractVotingTest;
import lt.vtvpmc.java.voting.VoteRegistry;

public class VotingTest extends AbstractVotingTest {

    @Override
    protected VoteRegistry getVoteRegistry() {
        return new VoteRegistryImplementation();
    }
}
