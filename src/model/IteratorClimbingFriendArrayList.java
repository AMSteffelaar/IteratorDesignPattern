package model;

import java.util.List;

public class IteratorClimbingFriendArrayList implements Iterator {

    List<Friend> climbingFriendList;

    // Houdt positie bij
    int pos = 0;

    // Constructor
    public IteratorClimbingFriendArrayList(List<Friend> climbingFriendList) {
        this.climbingFriendList = climbingFriendList;
    }

    public Object next() {
        // Geef het volgende element uit de ArrayList en hoog de positie op
        Friend friend = climbingFriendList.get(pos);
        pos += 1;
        return friend;
    }

    // Is er een volgende?
    @Override
    public boolean hasNext() {
        if (pos >= climbingFriendList.size() || climbingFriendList.get(pos) == null) {
            return false;
        } else {
            return true;
        }
    }

}
