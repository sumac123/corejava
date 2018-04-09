package comparableandcomparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Learners> {

	@Override
	public int compare(Learners o1, Learners o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}

}
