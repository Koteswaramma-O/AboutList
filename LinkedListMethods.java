package collections;

import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(70);
		ll.add(80);

		// Inserts the specified element at the beginning of this list.
		ll.addFirst(00);

		// Appends the specified element to the end of this list.
		ll.addLast(90);

		// Displaying elements
		System.out.println(ll);

		// Removes and returns the last element from this list.
		ll.removeLast();

		// Removes and returns the first element from this list.
		ll.removeFirst();

		// displaying elements after removing
		System.out.println(ll);

		// Returns the first element in this list.
		System.out.println("first element :" + ll.getFirst());

		// Returns the last element in this list.
		System.out.println("last Element :" + ll.getLast());
		// Retrieves and removes the first element of this list.
		ll.poll();

		/*
		 * Retrieves and removes the first element of this list, or returns null if this
		 * list is empty
		 */
		System.out.println("PollFirst() :" + ll.pollFirst());
		System.out.println(ll);

		/*
		 * Retrieves and removes the last element of this list, or returns null if this
		 * list is empty.
		 */
		System.out.println("PollLast() :" + ll.pollLast());
		System.out.println(ll);

		// Retrieves, but does not remove, the head (first element) of this list.
		System.out.println("peek() :" + ll.peek());

		/*
		 * Retrieves, but does not remove, the first element of this list, or returns
		 * null if this list is empty.
		 */
		System.out.println("peekFirst()" + ll.peekFirst());
		/*
		 * Retrieves, but does not remove, the Last element of this list, or returns
		 * null if this list is empty.
		 */
		System.out.println("peekLast() :" + ll.peekLast());
		ll.clone();
		ll.clear();

	}

}
