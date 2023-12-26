package com.day14;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> unorderedList = new LinkedList<>();
        unorderedList.add(56);
        unorderedList.add(30);
        unorderedList.add(70);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addElements(70, 30, 56);

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.appendElements(56, 30, 70);

        LinkedList<Integer> list4 = new LinkedList<>();
        list4.addElements(56, 70);
        Node<Integer> nodeToInsert = list4.search(56);
        list4.insertAfter(nodeToInsert, 30);

        LinkedList<Integer> list5 = new LinkedList<>();
        list5.addElements(56, 30, 70);
        list5.pop();

        LinkedList<Integer> list6 = new LinkedList<>();
        list6.addElements(56, 30, 70);
        list6.popLast();

        LinkedList<Integer> list7 = new LinkedList<>();
        list7.addElements(56, 30, 70);
        Node<Integer> searchedNode = list7.search(30);
        System.out.println("Node found with key 30: " + searchedNode.data);

        LinkedList<Integer> list8 = new LinkedList<>();
        list8.addElements(56, 30, 70);
        Node<Integer> keyNode = list8.search(30);
        list8.insertAfterKey(keyNode.data, 40);

        LinkedList<Integer> list9 = new LinkedList<>();
        list9.addElements(56, 30, 40, 70);
        list9.deleteByKey(40);
        System.out.println("LinkedList size: " + list9.size());

        LinkedList<Integer> orderedList = new LinkedList<>();
        orderedList.addInOrder(56);
        orderedList.addInOrder(30);
        orderedList.addInOrder(40);
        orderedList.addInOrder(70);

        System.out.println("Unordered LinkedList:");
        unorderedList.printList();

        System.out.println("\nLinkedList by adding elements:");
        list2.printList();

        System.out.println("\nLinkedList by appending elements:");
        list3.printList();

        System.out.println("\nLinkedList by inserting between two nodes:");
        list4.printList();

        System.out.println("\nLinkedList after deleting the first element:");
        list5.printList();

        System.out.println("\nLinkedList after deleting the last element:");
        list6.printList();

        System.out.println("\nSearch in LinkedList:");
        list7.printList();

        System.out.println("\nInsert after key in LinkedList:");
        list8.printList();

        System.out.println("\nDelete by key in LinkedList:");
        list9.printList();

        System.out.println("\nOrdered LinkedList:");
        orderedList.printList();
    }
}