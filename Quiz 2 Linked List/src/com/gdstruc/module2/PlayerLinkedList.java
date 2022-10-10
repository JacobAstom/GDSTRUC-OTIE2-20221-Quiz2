package com.gdstruc.module2;

import org.w3c.dom.Node;

public class PlayerLinkedList {
    private PlayerNode head;

    // function to add a new player to the front of the linked list
    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void deleteFirst() {
        if(this.head != null){
            PlayerNode temp = head;
            this.head = this.head.getNextPlayer();
            temp = null;
        }
    }

    // function to print the elements of the linked list
    public void printList() {
        int count = 0;
        System.out.print("HEAD -> ");
        PlayerNode curent = head;

        while (curent != null) {
            count++;
            System.out.print(curent.getPlayer() + " -> ");
            curent = curent.getNextPlayer();
        }

        System.out.print(" NULL\n");
        System.out.print("Size: " + count + "\n");
    }
    public void containsPlayer(Player player){
        int count = 0;
        boolean condition = false;
        PlayerNode curent = head;

        while(curent != null) {
            count++;
            if (curent.getPlayer() == player) {
                condition = true;
            }
            curent = curent.getNextPlayer();
        }

        System.out.print("Is " + player + " in the list? " + condition + "\n");
    }

    public int indexOfPlayer(Player player){
        int count = 0;
        int index = 0;

        PlayerNode curent = head;
        while(curent != null){

            if (curent.getPlayer() == player){
                return count;
            }
            count++;
            curent = curent.getNextPlayer();
        }
        return -1;
    }

}


