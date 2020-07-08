package com.codersbay;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GenericQueueTest {

    @Test
    @DisplayName("Assert that a newly intialized queue throws an exception when pop is run")
    public void testForExceptionThrownOnEmptyQueue() {
        GenericQueue<Integer> integerGenericQueue = new GenericQueue<>();
        assertThrows(QueueEmptyException.class, () -> {
            integerGenericQueue.dequeue();
        });
    }

    @Test
    @DisplayName("Assert that number of sequentially enqueued elements equals the length")
    public void testForLengthAfterNumerousEnqueues() {
        GenericQueue<Integer> integerGenericQueue = new GenericQueue<>();
        integerGenericQueue.enqueue(10);
        integerGenericQueue.enqueue(20);
        integerGenericQueue.enqueue(100);
        integerGenericQueue.enqueue(160);
        integerGenericQueue.enqueue(110);
        integerGenericQueue.enqueue(5);
        assertEquals(integerGenericQueue.length(), 6);
    }

    @Test
    @DisplayName("Assert that the right element is front on the queue")
    public void testForRightBoolOnPeek() {
        GenericQueue<Boolean> booleanGenericQueue = new GenericQueue<>();
        booleanGenericQueue.enqueue(false);
        booleanGenericQueue.enqueue(true);
        booleanGenericQueue.enqueue(true);
        booleanGenericQueue.enqueue(true);
        booleanGenericQueue.enqueue(false);
        booleanGenericQueue.enqueue(true);
        booleanGenericQueue.enqueue(true);
        booleanGenericQueue.enqueue(false);
        booleanGenericQueue.enqueue(false);
        booleanGenericQueue.enqueue(true);

        try {
            booleanGenericQueue.dequeue();
            booleanGenericQueue.dequeue();
            booleanGenericQueue.dequeue();
            booleanGenericQueue.dequeue();
        } catch (QueueEmptyException exception) {
            exception.printStackTrace();
        }

        assertEquals(booleanGenericQueue.peek(), false);
    }


}