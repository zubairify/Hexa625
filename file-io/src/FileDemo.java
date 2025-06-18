import java.io.File;
import java.sql.Date;

public class FileDemo {

	public static void main(String[] args) throws Exception {
		String path = "D:\\temp\\hello.txt";
		File file = new File(path);
		
		if(file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.getCanonicalPath());
			System.out.println(file.getAbsolutePath());
			
			if(file.isFile()) {
				System.out.println(file.canRead());
				System.out.println(file.canWrite());
				System.out.println(file.canExecute());
				
				Date date = new Date(file.lastModified());
				System.out.println(date);

				System.out.println(file.length());
			} else {
				System.out.println("Content of the directory");
				String[] contents = file.list();
				for (String f : contents) 
					System.out.println(f);
			}
		} else 
			System.out.println("File does not exist");
	}
}
