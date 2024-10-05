package io.github.sonnetsaif.dsimpl.Queue;


public class QueueLinkedList {

    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        newNode.next = null;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Nothing to remove");
            return -1;
        }
        int data = head.data;
        if (head == tail) {
            head = tail = null;
            return data;
        }
        head = head.next;
        return data;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Nothing to show");
            return -1;
        }
        return head.data;
    }
}
