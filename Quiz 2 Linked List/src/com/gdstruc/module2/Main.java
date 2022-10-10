package com.gdstruc.module2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // add players to the ArrayList
        Player goku = new Player(1, "Goku", 9001);
        Player vegeta = new Player(2, "Vegeta", 9000);
        Player broly = new Player(3, "Broly", 20000);

        // add the players to a linked list
        PlayerLinkedList linkedList = new PlayerLinkedList();
        linkedList.addToFront(goku);
        linkedList.addToFront(vegeta);
        linkedList.addToFront(broly);

        // add one more player
        linkedList.addToFront(new Player(10, "Yamcha", 500));


        // print the elements of the starting from the head
        linkedList.printList();

        linkedList.deleteFirst();

        linkedList.containsPlayer(goku);

        int index = linkedList.indexOfPlayer(vegeta);
        System.out.print("This Player is found in: " + index + "\n");
    }
}



