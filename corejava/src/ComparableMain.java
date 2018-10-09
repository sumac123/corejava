import java.util.ArrayList;
import java.util.Collections;

// Driver class
public class ComparableMain {
	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("Force Awakens", 8.3, 1993));
		list.add(new Movie("Star Wars", 8.7, 2015));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		for (Movie movie : list) {
			System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());

		}

ArrayList a1 = new ArrayList();
a1.add(8);
a1.add("a1String"); // I changed the string value to be more clear what is a1 and what is the string "a1"
// a1 content: [8, "a1String"]

ArrayList a2 = new ArrayList();
a2.addAll(a1);
// a2 content: [[8, "a1String"]] - basically [a1]
// a2 has one item - a1

ArrayList a3 = new ArrayList();
a3.add(a1);
	}
}
