package main;

import queue.MyQueue;

public class MyMain {
    public static void main(String[] args) {
        MyQueue queue=new MyQueue();
        System.out.println(queue.isEmpty());
        System.out.println(queue.getSize());
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.getSize());
        System.out.println(queue.peek());

    }
}
