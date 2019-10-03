package controller;

import model.*;

public class IteratorLauncher {

    public static void main(String[] args) {

        // VOORBEELD 1 - ARRAY
        System.out.println("\n----- VOORBEELD MET EEN ARRAY VAN DRIE METALVRIENDEN -----\n");

        MetalFriendArray mfa = new MetalFriendArray();
        FriendViewer viewer1 = new FriendViewer(mfa);
        viewer1.printList();


        // VOORBEELD 2 - ARRAYLIST
        System.out.println("\n----- VOORBEELD MET EEN ARRAYLIST VAN KLIMVRIENDEN -----\n");

        ClimbingFriendArrayList cfal = new ClimbingFriendArrayList();
        FriendViewer viewer2 = new FriendViewer(cfal);
        viewer2.printList();


        // VOORBEELD 3 - STACK -
        System.out.println("\n----- VOORBEELD MET EEN STACK VAN KLIMVRIENDEN -----\n");
        ClimbingFriendStack cfs = new ClimbingFriendStack();
        FriendViewer viewer3 = new FriendViewer(cfs);
        viewer3.printList();

        // VOORBEELD 4 - SINGLY LINKED LIST
        System.out.println("\n----- VOORBEELD SINGLY LINKED LIST VAN KLIMVRIENDEN -----\n");
        ClimbingFriendSinglyLinkedList cfsll = new ClimbingFriendSinglyLinkedList();
        FriendViewer viewer4 = new FriendViewer(cfsll);
        viewer4.printList();
    }

}
