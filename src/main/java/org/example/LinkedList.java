package org.example;

public class LinkedList {
    private Node head;
    public LinkedList(){
        this.head=null;
    }
    public void addToFront(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addToEnd(int data){
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }
    public void removeFromFront(){
        if(head == null) return;
        head = head.next;
    }
    public void removeFromEnd(){
        if(head == null) return;
        if(head.next == null){
            head = null;
            return;
        }
        Node current = head;
        while(current.next.next != null) current = current.next;
        current.next = null;
    }
    public void printList(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
