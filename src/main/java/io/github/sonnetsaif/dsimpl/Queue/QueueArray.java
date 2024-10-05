package io.github.sonnetsaif.dsimpl.Queue;

public class QueueArray {

    // front point to start of the queue
    // rear point to end of the queue
    int[] arr;
    int size;
    int front = -1;
    int rear = -1;
    public QueueArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    //check if empty
    public boolean isEmpty() {
        return rear == -1;
    }

    //check if full
    public boolean isFull() {
        return rear == size - 1;
    }

    // O(1)
    public void add(int data) {
        if (isFull()) {
            System.out.println("full queue");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    // O(n)
    public int remove() {
        if (isEmpty()) {
            System.out.println("nothing to remove");
            return -1;
        }
        int front = arr[0];
        for (int i = 0; i < rear; i++) {
            arr[i] = arr[i + 1];
        }
        rear--;
        return front;
    }

    // O(1)
    public int peek() {
        if (isEmpty()) {
            System.out.println("nothing to show");
            return -1;
        }
        return arr[0];
    }
}
