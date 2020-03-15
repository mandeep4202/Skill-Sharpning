package com.target11.dataStructure.DSImpl.linkedlistimpl;

public class MyLinkedListImpl implements MyLinkedList {

    Node head;

    @Override
    public void insert(int value) {
        Node node = new Node(value);

        if (head == null) {

            head = node;
        } else {

            Node n = head;

            while (n.next != null) {
                n = n.next;
            }
            n.next = node;

        }


    }

    @Override
    public void printList() {

        Node n = head;

        while(n.next != null){

            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.print(n.data);
        System.out.print(" ");

    }

    @Override
    public void insertAtStart(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    @Override
    public void insertAtIndex(int index, int value) {
        Node newNode = new Node(value);

        Node n = head;
        for (int i = 0; i < index-1 ; i++) {
            n = n.next;
        }
        newNode.next = n.next;
        n.next = newNode;

    }
}
