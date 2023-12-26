package com.day14;

import java.util.LinkedList;
class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        this.list = new LinkedList<>();
    }

    public void push(T data) {
        list.add(data);
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return list.removeLast();
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        return list.getLast();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void printStack() {
        System.out.print("Stack: ");
        for (T item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}