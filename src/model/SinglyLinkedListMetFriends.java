package model;

public class SinglyLinkedListMetFriends {

    private Node first;

    //de nieuwe lijst is altijd leeg
    public SinglyLinkedListMetFriends() {
        first = null;
    }

    //methode om vrienden toe te voegen
    public void addFriend(Friend friend) {
        Node node = new Node(friend);
        node.next = first;  //de eerste toegevoegde vriend heeft geen next
        first = node;       //verschuif first naar voren
    }

    public Node getFirst() {
        return first;
    }
}
