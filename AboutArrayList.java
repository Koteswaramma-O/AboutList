package collections;

import java.util.ArrayList;

public class AboutArrayList {

	public static void main(String[] args) {

		// creating an empty ArrayList with initial capacity of ten.
		ArrayList<Integer> al = new ArrayList<Integer>();

		// Inserting values to empty ArrayList using add()
		al.add(1);
		al.add(2);
		al.add(3);

		// Inserts the specified element at the specified position in this list.
		al.add(0, 11);

		// Returns the element at the specified position in this list.
		int k = al.get(1);
		System.out.println("get() :" + k);

		/*
		 * Replaces the element at the specified position in this list with the
		 * specified element.
		 */
		al.set(2, 22);
		System.out.println(al);

		// checks the specified element is present in the list or not
		boolean b = al.contains(3);
		System.out.println("contains() :" + b);

		// Displaying number of elements in the list
		int size = al.size();
		System.out.println("size of al :" + size);

		// printing all the elements
		System.out.println("1st Set of values :" + al);

		// creating an empty ArrayList with initial capacity of ten
		int n = 5;
		ArrayList<Integer> all = new ArrayList<Integer>();

		// Inserting values to ArrayList using forLoop
		for (int i = 0; i < n; i++) {
			all.add(i);
		}

		// printing all the elements
		System.out.println("2nd Set of Values :" + all);

		/*
		 * Adding all the elements in the specified collection to the end of the
		 * ArrayLIst
		 */
		all.addAll(al);
		System.out.println(all);

		// Returns true if this list contains the specified element.
		boolean B = all.containsAll(al);
		System.out.println("ContainsAll() :" + B);

		/*
		 * Retains only the elements in this list that are contained in the specified
		 * collection.
		 */
		all.retainAll(al);
		System.out.println("retainAll() :" + all);

		int size1 = all.size();
		System.out.println("Size of all :" + size1);

		// removing the reference from the List
		all.remove(al);

		// Removes all the elements from the List
		all.clear();

		// Returns true if this list contains no elements.
		if (all.isEmpty()) {
			System.out.println("collection is Empty");
		} else {
			System.out.println(all);
		}
		System.out.println(all.size());

	}

}
