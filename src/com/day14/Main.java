package com.day14;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(56);
        stack.push(30);
        stack.push(70);
        stack.printStack();

        while (!stack.isEmpty()) {
            System.out.println("Peek: " + stack.peek());
            System.out.println("Pop: " + stack.pop());
            stack.printStack();
        }

        Queue<Integer> queue = new Queue<>();

        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.printQueue();

        while (!queue.isEmpty()) {
            System.out.println("Dequeue: " + queue.dequeue());
            queue.printQueue();
        }
    }
}