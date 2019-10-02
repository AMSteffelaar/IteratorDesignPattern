package model;

public class IteratorMetalFriendArray implements Iterator {

    Friend[] metalFriendList;

    // Houdt huidige positie in de array bij
    int pos = 0;

    // Constructor neemt de vriendenlijst over
    // waar we doorheen willen itereren
    public IteratorMetalFriendArray(Friend[] metalFriendList) {
        this.metalFriendList = metalFriendList;
    }

    public Object next() {
        // Geef het volgende element uit de array en hoog de positie op
        Friend friend = metalFriendList[pos];
        pos += 1;
        return friend;
    }

    // Is er een volgend object?
    @Override
    public boolean hasNext() {
        if (pos >= metalFriendList.length || metalFriendList[pos] == null) {
            return false;
        } else {
            return true;
        }
    }

}
