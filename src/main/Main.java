package main;

import definition.SinglyLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list=new SinglyLinkedList<> ();
        list.addFirst ( 67 );
        list.add(1,88);
        list.printList ();
    }
}
