package collections;

import java.util.ArrayList;

public class StackarrayList {

	private ArrayList<Integer> listStack = null;

	public StackarrayList() {
		listStack = new ArrayList<>();
	}

	public void push(int value) {
		   System.out.println("Push " + value + " in stack");
		listStack.add(value);
	}

	public int top() {
		int show = listStack.get(listStack.size() - 1);
		System.out.println("show stack elemets" + show);
		return show;

	}

	public static void main(String[] args) {
		StackarrayList st = new StackarrayList();
		st.push(123);
		st.push(34);
		st.top();
	}
}
