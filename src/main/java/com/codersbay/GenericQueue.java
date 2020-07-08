package com.codersbay;

import java.util.LinkedList;
import java.util.Queue;

public class GenericQueue<T> {

    private final Queue<T> contentOfQueue;

    public GenericQueue() {
        contentOfQueue = new LinkedList<>();
    }

    public int length() {
        return contentOfQueue.size();
    }

    public T dequeue() throws QueueEmptyException {
        if (contentOfQueue.isEmpty()) {
            throw new QueueEmptyException("Queue has no elements - cannot dequeue!");
        } else {
            return contentOfQueue.poll();
        }
    }

    public void enqueue(T element) {
        contentOfQueue.add(element);
    }

    public T peek() {
        return contentOfQueue.peek();
    }

    @Override
    public String toString() {
        return "Elements in queue: " + contentOfQueue;
    }
}
