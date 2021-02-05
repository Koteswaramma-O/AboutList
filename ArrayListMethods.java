package collections;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating an empty ArrayList with initial capacity of ten.
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Inserting values to empty ArrayList using add()
		al.add(10);
		al.add(22);
		al.add(35);
		al.add(46);
		al.add(10);

		// returns the first occurrence of specified element present at the given index
		System.out.println("indexOf() :" + al.indexOf(10));

		// returns the last occurrence of specified element present at the given index
		System.out.println("lastIndexOf() :" + al.lastIndexOf(10));

		// Removes the element at the specified position in this list.
		al.remove(0);
		System.out.println("remove() :" + al);
		/*
		 * Removes from this list all of its elements that are contained in the
		 * specified collection.
		 */
		al.removeAll(al);
		System.out.println("removeAll() :" + al);

	}

}
