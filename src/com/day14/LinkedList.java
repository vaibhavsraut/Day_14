package com.day14;

import java.util.Iterator;

class LinkedList<T extends Comparable<T>> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void addElements(T... elements) {
        for (T element : elements) {
            add(element);
        }
    }

    public void appendElements(T... elements) {
        for (T element : elements) {
            Node<T> newNode = new Node<>(element);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
    }

    public void insertAfter(Node<T> prevNode, T data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node<T> newNode = new Node<>(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void pop() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        head = head.next;
    }

    public void popLast() {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node<T> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    public Node<T> search(T key) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(key)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfterKey(T key, T data) {
        Node<T> keyNode = search(key);
        if (keyNode == null) {
            System.out.println("Key not found");
            return;
        }

        insertAfter(keyNode, data);
    }

    public void deleteByKey(T key) {
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        if (head.data.equals(key)) {
            pop();
            return;
        }

        Node<T> current = head;
        Node<T> prev = null;

        while (current != null && !current.data.equals(key)) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Key not found");
            return;
        }

        prev.next = current.next;
        if (current.next == null) {
            tail = prev;
        }
    }

    public void addInOrder(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null || head.data.compareTo(data) > 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            return;
        }

        Node<T> current = head;
        while (current.next != null && current.next.data.compareTo(data) < 0) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }
    }

    public int size() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    public void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
