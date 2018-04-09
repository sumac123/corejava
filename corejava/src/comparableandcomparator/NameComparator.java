package comparableandcomparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Learners>{

	@Override
	public int compare(Learners o1, Learners o2) {
		
		return o1.getName().compareTo(o2.getName());
	}

}
