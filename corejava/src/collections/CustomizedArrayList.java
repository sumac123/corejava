package collections;

import java.util.Arrays;

class ArrayListCustom<E> {
	private static final int INITIAL_CAPACITY = 1;
	private int size = 0;
	private Object elementData[] = {};

	public ArrayListCustom() {
		elementData = new Object[INITIAL_CAPACITY];
	}

	public void add(E e) {
		if (size == elementData.length) {
			ensureCapacity();
		}
		elementData[size++] = e;
	}

	private void ensureCapacity() {
		int increasdNewCapacity = elementData.length * 2;
		elementData = Arrays.copyOf(elementData, increasdNewCapacity);

	}

	public E get(int index) {

		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
		}
		return (E) elementData[index];
	}

	public void display() {
		for (int i = 0; i < size; i++) {
			System.out.println(elementData[i]);
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
		// System.out.println(al.display());

	}
}
