package org.example;

public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addToFront(15);
        list.addToFront(14);
        list.addToFront(13);
        System.out.print("Linked List -> ");
        list.printList();
        System.out.println();
        list.addToEnd(20);
        System.out.print("Linked List After Add To The End -> ");
        list.printList();
        System.out.println();
        list.removeFromFront();
        System.out.print("Linked List After Remove From the Front -> ");
        list.printList();
        System.out.println();
        list.removeFromEnd();
        System.out.print("Linked List After Remove From the End -> ");
        list.printList();
    }
}