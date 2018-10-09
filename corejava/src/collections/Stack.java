package collections;

import java.util.Arrays;

public class Stack<E> {

	private static int initialCapacity = 100;
	Object elements[];
	private int size = 0;

	public Stack() {
		elements = new Object[initialCapacity];

	}

	private void enshureCapacity() {

		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	public void push(E e) {

		if (size == elements.length) {
			enshureCapacity();
		} else {
			elements[size++] = e;
		}
	}

	public void peek() {
		for (int i = 0; i < size; i++) {
			System.out.println(elements[i]);
		}
	}

	public static void main(String[] args) {
		Stack<Integer> e = new Stack<>();
		e.push(100);
		e.push(200);
		e.peek();
	}

}
