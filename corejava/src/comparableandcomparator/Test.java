package comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		Learners l=new Learners(1, "madhu", 23, 2015, "Bangalore");
		Learners l1=new Learners(2, "shanmuka", 22, 2015, "Bangalore");
		Learners l2=new Learners(3, "babu", 24, 2015, "Bangalore");
		Learners l3=new Learners(4, "narendra", 25, 2015, "Bangalore");
		Learners l4=new Learners(5, "kiran", 23, 2015, "Bangalore");
		
		ArrayList<Learners> al=new ArrayList<Learners>();
		al.add(l);
		al.add(l1);
		al.add(l2);
		al.add(l3);
		al.add(l4);
		
		
		Collections.sort(al,new AgeComparator());
		Collections.sort(al, new NameComparator());
		
		for(Learners ls:al){
			System.out.println(ls.getId() + " "+ls.getName()+ " "+ls.getAge()+" "+ls.getPassedout()+ " "+ls.getFrom());
			
		}
		
	}

}
