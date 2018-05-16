package System.out;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListRemoveDuplicates {
	public static void main(String[] args) {
	    List<Integer>  arraylist = new ArrayList<Integer>();
	    arraylist.add(1);
	    arraylist.add(1);
	    arraylist.add(2);
	    arraylist.add(2);
   
       HashSet<Integer> hashset = new HashSet<Integer>();
	    hashset.addAll(arraylist);
	    arraylist.clear();
	    arraylist.addAll(hashset);
	    System.out.println("After Removing duplicate elements:"+arraylist);
       //without set
	    List<Integer>  newList = new ArrayList<Integer>();
	    for (int i = 0; i < arraylist.size() ; i++) {
	    	
			if (!newList.contains(arraylist.get(i)))
	            newList.add( (arraylist.get(i)));
	    }
System.out.println(newList);
	}

}
