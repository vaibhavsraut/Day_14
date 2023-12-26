package com.day14;

import java.util.LinkedList;
class Queue<T> {
    private LinkedList<T> list;

    public Queue() {
        this.list = new LinkedList<>();
    }

    public void enqueue(T data) {
        list.addLast(data);
    }

    public T dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return list.removeFirst();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void printQueue() {
        System.out.print("Queue: ");
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}