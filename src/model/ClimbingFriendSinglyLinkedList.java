package model;

public class ClimbingFriendSinglyLinkedList implements Collection {

    private SinglyLinkedListMetFriends sllmf;

    public ClimbingFriendSinglyLinkedList() {
        sllmf = new SinglyLinkedListMetFriends();
        Friend friend1 = new Friend("Remco");
        Friend friend2 = new Friend("Ronald");
        Friend friend3 = new Friend("Rene");

        sllmf.addFriend(friend1);

        sllmf.addFriend(friend2);

        sllmf.addFriend(friend3);
    }

    @Override
    public Iterator getIterator() {
        return new IteratorClimbingFriendSinglyLinkedList(sllmf);
    }
}
