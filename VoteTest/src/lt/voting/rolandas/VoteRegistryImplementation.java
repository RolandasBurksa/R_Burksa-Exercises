package lt.voting.rolandas;

import lt.vtvpmc.java.voting.Vote;
import lt.vtvpmc.java.voting.VoteRegistry;

import java.util.ArrayList;
import java.util.List;

public class VoteRegistryImplementation implements VoteRegistry {

    private final List<Vote> voteRegistry = new ArrayList<>();

    private boolean votingStopped = false;


    @Override
    public boolean registerVote(Vote vote) {

        if (votingStopped) {
            return false;
        }

        for (Vote voteInVote : voteRegistry) {
            if (voteInVote.getVoterId().equals(vote.getVoterId())) {
                return false;
            }
        }
        voteRegistry.add(vote);
        return true;
    }


    @Override
    public String getAWinner() {
//        if (voteRegistry.isEmpty()) {
//            return null;
//        }
//
//        int candidate1 = 0;
//        int candidate2 = 0;
//        String firstCandidat = voteRegistry.get(0);
//        for (Vote vote : voteElements) {
//            if (vote.getVoteCastFor().equals(firstCandidat)) {
//                candidate1++;
//            } else {
//                candidate2++;
//            }
//            if (candidate1 > candidate2) {
//                return firstCandidat;
//            } else {
//                return  secondCandidate;
//            }
        return null;
    }


    @Override
    public int getNumberOfVotesCast() {
        return voteRegistry.size();
    }

    @Override
    public void stopVotingProcess() {
        votingStopped = true;
    }
}

