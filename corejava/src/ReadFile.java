import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFile {
	public static void main(String[] args) throws IOException {
		File file = new File("/Users/pooja.j/Desktop/pooja.txt");
		FileInputStream ios = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(ios);
		BufferedReader reader = new BufferedReader(input);

		String line;

		int characterCount = 0;

		// Reading line by line from the
		// file until a null is returned
		while ((line = reader.readLine()) != null) {
			if (!(line.equals(""))) {

				characterCount += line.length();

			}
		}

		System.out.println("Total number of characters = " + characterCount);
		FileWriter wrt = new FileWriter("/Users/pooja.j/Desktop/pooja.txt");
		try {
			wrt.write("java");
		} catch (Exception e) {
			e.getMessage();
		}

	}
}
