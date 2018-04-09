import java.util.ArrayList;
import java.util.Collections;

// Driver class
public class ComparableMain
{
	public static void main(String[] args)
	{
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("Force Awakens", 8.3, 1993));
		list.add(new Movie("Star Wars", 8.7, 2015));
		list.add(new Movie("Empire Strikes Back", 8.8, 1980));
		list.add(new Movie("Return of the Jedi", 8.4, 1983));

		Collections.sort(list);

		System.out.println("Movies after sorting : ");
		for (Movie movie: list)
		{
			System.out.println(movie.getName() + " " +
							movie.getRating() + " " +
							movie.getYear());
		}
/*		String [] [] s=new String [6] [3];
		System.out.println(s.length);*/
	}
}



