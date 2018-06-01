package collections;

import java.util.Arrays;
/*
 * cutomized ArrayList
 */

class ArrayListCustom<E> {
	private static final int INITIAL_CAPACITY = 2;
	private int size = 0;
	private Object elementData[] = {};

	/*
	 * costructor for Custom ArrayList
	 */
	public ArrayListCustom() {
		elementData = new Object[INITIAL_CAPACITY];
	}
	/*
	 * adding elements
	 */
	public void add(E e) {
		if (size == elementData.length) {
			ensureCapacity(); // increase current capacity of list, make it
								// double.
		}
		elementData[size++] = e;
	}

	/*
	 * increaing current capacity of ArrayList
	 */
	private void ensureCapacity() {
		int increasdNewCapacity = elementData.length * 2;
		elementData = Arrays.copyOf(elementData, increasdNewCapacity);
	}

	/**
	 * method returns element on specific index.
	 */
	@SuppressWarnings("unchecked")
	public E get(int index) {
		// if index is negative or greater than size of size, we throw
		// Exception.
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		return (E) elementData[index]; // return value on index.
	}

	/**
	 * remove elements from custom/your own ArrayList method returns
	 *
	 * removedElement on specific index. else it throws IndexOutOfBoundException if
	 * index is negative or greater than size of size.
	 */
	public Object remove(int index) {
		// if index is negative or greater than size of size, we throw
		// Exception.
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		Object removedElement = elementData[index];
		for (int i = index; i < size - 1; i++) {
			elementData[i] = elementData[i + 1];
		}
		size--; // reduce size of ArrayListCustom after removal of element.

		return removedElement;
	}

	/*
	 * displying customized arryaList data
	 */
	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println("elemets" + elementData[i]);
		}
	}
}

public class CustomizedArrayList {
	public static void main(String... agrs) {
		ArrayListCustom<Integer> al = new ArrayListCustom<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(3);
		al.display();
		System.out.println(al.get(3));

	}
}
