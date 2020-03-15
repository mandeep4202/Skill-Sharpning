package com.target11.dataStructure.DSImpl.linkedlistimpl;

public class MyListRunner {

    public static void main(String[] args) {

        MyLinkedList ls= new MyLinkedListImpl();

        ls.insert(3);
        ls.insert(6);
        ls.insert(4);
        ls.insert(7);
        ls.insert(32);
        System.out.println(ls);
        ls.printList();
        ls.insertAtStart(70);
        System.out.println("Inserting at Start 70");
        ls.printList();
        System.out.println("insert at location");
        ls.insertAtIndex(2,30);
        ls.printList();
    }
}
