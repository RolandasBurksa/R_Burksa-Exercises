package lt.techin.rolandas;

import lt.infobalt.itakademija.javalang.exam.socialnetwork.Friend;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.FriendNotFoundException;
import lt.infobalt.itakademija.javalang.exam.socialnetwork.SocialNetwork;

import java.util.*;
import java.util.stream.Collectors;

public class SocialNetworkImplementation implements SocialNetwork {

    final List<Friend> friends = new ArrayList<>();

    @Override
    public void addFriend(Friend friend) {
        if ((friend.getCity() == null) || (friend.getFirstName() == null) || (friend.getLastName() == null)) {
            throw new IllegalArgumentException();
        }
        if (!friends.contains(friend)) {
            friends.add(friend);
        }
    }

    @Override
    public int getNumberOfFriends() {
        return friends.size();
    }

    @Override
    public Friend findFriend(String firstName, String lastName) throws FriendNotFoundException {
        Friend tempFriend = null;
        for (Friend friend : friends) {
            if (friend.getFirstName().equals(firstName) && (friend.getLastName().equals(lastName))) {
                tempFriend = friend;
            }
        }
        if (tempFriend == null) {
            throw new FriendNotFoundException(firstName, lastName);
        }
        return tempFriend;
    }

    @Override
    public Collection<Friend> findByCity(String city) {
        List<Friend> cityFriends = new ArrayList<>();
        for (Friend friend : friends) {
            if (friend.getCity().equals(city)) {
                cityFriends.add(friend);
            }
        }
        return cityFriends;
    }


    @Override
    public Collection<Friend> getOrderedFriends() {

//    return Collections.sort(friends,new OrderedFriendsComparator());

        return friends.stream()
                .sorted(Comparator.comparing(friend -> friend.getCity()).thenComparing((Comparator.comparing(friend -> friend.getLastName()))
                .sorted(Comparator.comparing(friend -> friend.getFirstName()))
                .collect(Collectors.toList());
    }
}

