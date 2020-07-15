package com.codersbay;


public class Main {


    public static void main(String[] args) throws QueueEmptyException {
        GenericQueue<Integer> integerGenericQueue = new GenericQueue<>();
        GenericQueue<String> stringGenericQueue = new GenericQueue<>();
        GenericQueue<Boolean> booleanGenericQueue = new GenericQueue<>();



        System.out.println("Integer Queue");
        integerGenericQueue.enqueue(10);
        integerGenericQueue.enqueue(140);
        integerGenericQueue.enqueue(15);
        integerGenericQueue.enqueue(20);
        integerGenericQueue.enqueue(55);
        System.out.println(integerGenericQueue.length() + " elements in queue");
        System.out.println(integerGenericQueue.peek() + " is the first element");
        System.out.println(integerGenericQueue.toString());
        System.out.println(integerGenericQueue.dequeue() + " was removed");
        System.out.println(integerGenericQueue.dequeue() + " was removed");
        System.out.println(integerGenericQueue.dequeue() + " was removed");
        System.out.println();
        System.out.println();
        System.out.println("String Queue");
        stringGenericQueue.enqueue("Something");
        stringGenericQueue.enqueue("Something else");
        stringGenericQueue.enqueue("Yet something else");
        System.out.println(stringGenericQueue.length() + " elements in queue");
        System.out.println(stringGenericQueue.peek() + " is the first element");
        System.out.println(stringGenericQueue.toString());
        System.out.println(stringGenericQueue.dequeue() + " was removed");
        System.out.println(stringGenericQueue.dequeue() + " was removed");
        System.out.println(stringGenericQueue.length() + " elements in queue");
        System.out.println();
        System.out.println();
        System.out.println("Boolean Queue");
        booleanGenericQueue.enqueue(true);
        booleanGenericQueue.enqueue(false);
        System.out.println(booleanGenericQueue.length() + " elements in queue");
        System.out.println(booleanGenericQueue.peek() + " is the first element");
        booleanGenericQueue.enqueue(false);
        booleanGenericQueue.enqueue(true);
        System.out.println(booleanGenericQueue.toString());
        System.out.println(booleanGenericQueue.dequeue() + " was removed");
        System.out.println(booleanGenericQueue.dequeue() + " was removed");
        System.out.println(booleanGenericQueue.length() + " elements in queue");
        System.out.println(booleanGenericQueue.peek() + " is the first element");


    }

}
