package queueDemo;

public class MyCircularQueue {

    private int [] data;

    private int head;

    private int tail;

    public MyCircularQueue(){

    }

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        data=new int[k+2];
        head=0;
        tail=1;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        data[tail]=value;
        tail=(tail+1)%data.length;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()) {
            return false;
        }
        head=(head+1)%data.length;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if(isEmpty()) {
            return -1;
        }
        return data[(head+1)%data.length];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if(isEmpty()) {
            return -1;
        }
        return data[(tail+data.length-1)%data.length];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        if((head+1)%data.length==tail) {
            return true;
        }
        return false;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        if((tail+1)%data.length==head) {
            return true;
        }
        return false;
    }
}
