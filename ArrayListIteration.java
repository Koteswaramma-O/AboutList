package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		/*
		 * here are the ways to iterate the List 1)forLoop 2)forEachLoop 3)whileLoop
		 * 4)iterator 5)listIterator
		 */

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

		// 1)using forLoop
		System.out.print("Using forLoop :");
		for (int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}

		// 2)using forEachLoop
		System.out.print(" \n" + "Using For Each :");
		for (int k : al) {
			System.out.print(k + " ");
		}

		// 3)using while Loop
		System.out.print("\n" + "using whileLoop :");
		int j = 0;
		while (j < al.size()) {
			System.out.print(al.get(j) + " ");
			j++;
		}

		// 4)using Iterator\
		System.out.print("\n" + "using iterator :");
		Iterator i = al.iterator();
		while (i.hasNext()) {
			System.out.print(i.next() + " ");
		}

		// 5)using listIteratir
		System.out.print("\n" + "using ListIterator :");
		ListIterator ll = al.listIterator();
		while (ll.hasNext()) {
			System.out.print(ll.next() + " ");
		}
		ll.remove();
		ll.add(al);
		ll.nextIndex();
		while (ll.hasPrevious()) {
			System.out.print(ll.previous() + " ");
		}

	}

}
