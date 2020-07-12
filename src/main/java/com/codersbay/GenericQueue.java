package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class GenericQueue<T> {

    private final List<T> contentOfQueue;

    public GenericQueue() {
        contentOfQueue = new ArrayList<>();
    }

    public int length() {
        return contentOfQueue.size();
    }

    public T dequeue() throws QueueEmptyException {
        if (contentOfQueue.isEmpty()) {
            throw new QueueEmptyException("Queue has no elements - cannot dequeue!");
        } else {
            return contentOfQueue.remove(contentOfQueue.size() - 1);
        }
    }

    public void enqueue(T element) {
        T saver;

        if (contentOfQueue.isEmpty()) {
            contentOfQueue.add(element);
        } else {
            /* TODO
            1.) einen eintrag (= index) hinzufügen - wert egal, deshalb einfach "element"
            2.) gehe vom letzten element bis zum ersten alle bisherigen indizes durch
            um die werte eins nach rechts zu kopieren
            3.) den 0-ten index mit dem neuen wert überschreiben
             */
            contentOfQueue.add(element);
            for (int i = contentOfQueue.size() - 1; i > 0; i--) {
                contentOfQueue.set(i, contentOfQueue.get(i - 1));
            }
            contentOfQueue.set(0, element);
            // geht sicher eleganter, aber was besseres fällt mir ned ein
        }
    }

    public T peek() {
        return contentOfQueue.get(contentOfQueue.size() - 1);
    }

    @Override
    public String toString() {
        return "Elements in queue: " + contentOfQueue;
    }
}
