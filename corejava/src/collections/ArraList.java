package collections;

import java.util.ArrayList;
import java.util.List;

public class ArraList {

	public static void main(String[] args) {
		List x = new ArrayList();
		x.add(1);
		x.add(2);
		met(x);
		System.out.println(x);
		List y = x;
		y.add(6);
		List z = new ArrayList(x);
		z.add(4);
		z.add(5);
		
		System.out.println(y);
		System.out.println(z);
	}

	static void met(List i) {
		i.add(3);
	}
}
