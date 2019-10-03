package model;

public class IteratorClimbingFriendSinglyLinkedList implements Iterator {

    Node current;

    SinglyLinkedListMetFriends sllmf;

    public IteratorClimbingFriendSinglyLinkedList(SinglyLinkedListMetFriends sllmf) {
        this.sllmf = sllmf;
        this.current = sllmf.getFirst() ;
    }

    public boolean hasNext() {
        if (current != null) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        Node next;                  //is nodig om de next van de current te pakken en de current te kunnen verschuiven
        next = current;             //is nodig om dat deze moet worden gegeven
        current = next.next;
        return next.friend;
    }

}
