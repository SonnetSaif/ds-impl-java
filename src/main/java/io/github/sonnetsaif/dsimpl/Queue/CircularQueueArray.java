package io.github.sonnetsaif.dsimpl.Queue;

public class CircularQueueArray {
    int[] arr;
    int size;
    int front = -1;
    int rear = -1;

    public CircularQueueArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    public boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public boolean isFull(){
        return (rear + 1) % size == front;
    }

    public void add(int data){
        if(isFull()){
            System.out.println("full queue");
            return;
        }
        // for 1st element add
        if(front == -1) front = 0;

        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("nothing to remove");
            return -1;
        }
        int temp = arr[front];
        if(rear == front) rear = front = -1;
        else {
            front = (front + 1) % size;
        }
        return temp;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("nothing to show");
            return -1;
        }
        return arr[front];
    }
}
