package io.github.sonnetsaif.dsimpl.LinkedList;

public class CustomLinkedList {

    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            // the node itself is the head node or
            // the head point to the node
            head = node;
        }
        else{
            // this node 'n' will point to the head
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            // the previous last node will now point to the new node;
            n.next = node;
        }
    }

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        // the new node's next will point to the head node
        /* if you want any node (not head) to point to another node, then use node.next = head;
            but if it is head, then head = node
         */
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0){
            insertAtStart(data);
            return;
        }
        Node n = head;
        int i = 0;
        while(i < index-1){
            n = n.next;
            i++;
        }
        Node temp = n.next;
        n.next = node;
        node.next = temp;

//        this also works
//        node.next = n.next;
//        n.next = node;
    }

    public void deleteAt(int index){
        Node node = head;
        int i = 0;
        while(i < index - 1){
            node = node.next;
            i++;
        }
        node.next = node.next.next;
    }

    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
