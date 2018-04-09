package collections;

import java.util.Stack;

public class StackDemo1 {
public static void main(String[] args) {
	Stack<String> st=new Stack<String>();
	st.add("madhu");
	st.add("dhoni");
	st.add("raina");
	st.add("jadeja");
	st.add("yuvi");
	System.out.println(st.capacity());
	System.out.println(st.size());
	for(int i=-4;i<st.size();i++){
		System.out.println(st.pop());
	}
	
	
}
}
