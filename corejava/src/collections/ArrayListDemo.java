package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
	List x=new ArrayList();
	
	x.add(1);
	x.add(2);
	
List y=x;

y.add(3);
List z=new ArrayList(x);
z.add(4);
z.add(5);


System.out.println("x"+x);
System.out.println("y"+y);
System.out.println("z"+z);

	}

}
