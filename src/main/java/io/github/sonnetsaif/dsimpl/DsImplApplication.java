package io.github.sonnetsaif.dsimpl;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

import io.github.sonnetsaif.dsimpl.LinkedList.*;
import io.github.sonnetsaif.dsimpl.Queue.*;

public class DsImplApplication {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<>();
		Queue<Integer> queue12 = new ArrayDeque<>();

        QueueArray q = new QueueArray(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty())
        {
            System.out.println(q.peek() + " ");
            q.remove();
        }

		CircularQueueArray cq = new CircularQueueArray(5);
		cq.add(1);
		cq.add(2);
		cq.add(3);
		cq.add(4);
		cq.add(5);
		System.out.println("removed " + cq.remove());
		cq.add(6);
		System.out.println("removed "+ cq.remove());

		while(!cq.isEmpty())
		{
			System.out.print(cq.peek() + " ");
			cq.remove();
		}

		QueueLinkedList ql = new QueueLinkedList();
		ql.add(1);
		ql.add(2);
		ql.add(3);

		while(!ql.isEmpty())
		{
			System.out.println(ql.peek() + " ");
			ql.remove();
		}

		CustomLinkedList list = new CustomLinkedList();
		list.insert(5);
		list.insert(12);
		list.insert(6);
		list.insert(9);
		list.insert(8);
		list.insertAtStart(18);
		list.insertAt(2, 10);
		list.insertAt(0, 20);
		list.deleteAt(2);
		list.show();
	}
}