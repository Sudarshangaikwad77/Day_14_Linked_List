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

    public void insertAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("previous node cannot be null");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("Welcome to Linked List Practice Problem");

        list.append(56);
        list.append(30);
        list.append(70);

        System.out.println("Linked list before insertion: ");
        list.printList();

        Node nodeWith30 = list.head.next;

        list.insertAfter(nodeWith30, 40);

        System.out.println("\nLinked list after insertion:");
        list.printList();
    }
}