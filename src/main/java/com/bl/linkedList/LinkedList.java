package com.bl.linkedList;
public class LinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }
    }

    public void delete(int key) {
        if (head == null) {
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node prev = null;
        Node current = head;

        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        prev.next = current.next;
    }

    // Method to get the size of the LinkedList
    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(56);
        list.add(30);
        list.add(40);
        list.add(70);

        System.out.println("Original LinkedList:");
        list.printList();

        list.delete(40);

        System.out.println("LinkedList after deleting node with key value of 40:");
        list.printList();

        System.out.println("Size of the LinkedList: " + list.size());
    }
}

