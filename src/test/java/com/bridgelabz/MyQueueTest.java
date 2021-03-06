package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
    @Test
    public void given3NumbersWhenAddedToQueue() {
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
        boolean result = myFirstNode.getNext().equals(mySecondNode) &&
                myFirstNode.getNext().getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void givenNumbersWhenDeletedFromQueueShouldPassed() {
        MyQueue myQueue = new MyQueue();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        myQueue.printQueue();
        myQueue.dequeue();
        myQueue.printQueue();
    }
}
