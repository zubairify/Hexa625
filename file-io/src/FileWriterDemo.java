import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		String path = "src/amazing.txt";
		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new FileWriter(path, true));
			writer.write("When I see your face");
			writer.newLine();
			writer.write("There's not a thing that I would change");
			writer.newLine();
			writer.write("Cause you're amazing, just the way you are");
			System.out.println("Writing to file completed.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
