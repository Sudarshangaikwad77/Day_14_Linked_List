package com.bl.linkedList;

public class LinkedList
{
    Node head; // head of the list

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("Welcome to Linked List Practice Problem");

        list.head = new Node(56);
        Node second = new Node(30);
        Node third = new Node(70);

        list.head.next = second;
        second.next = third;

        // print the linked list
        Node n = list.head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}

