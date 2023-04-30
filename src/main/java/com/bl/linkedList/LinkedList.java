package com.bl.linkedList;
public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void search(int value) {
        Node current = head;
        boolean found = false;

        while (current != null) {
            if (current.data == value) {
                found = true;
                break;
            }
            current = current.next;
        }

        if (found)
            System.out.println("value " + value + " found in the list.");
        else
            System.out.println("value " + value + " not found in the list.");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("Welcome to Linked List Practice Problem");

        list.head = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);

        list.head.next = second;
        second.next = third;

        list.search(30);
    }
}