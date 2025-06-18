import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BinaryReadDemo {

	public static void main(String[] args) {
		String path = "src/amazing.txt";
		
		FileInputStream istream = null;
		try {
			istream = new FileInputStream(path);
//			int ch = 0;
//			while(true) {
//				ch = istream.read();	// reading a byte from stream
//				if(ch == -1)	// When end of file reached
//					break;	// exit loop
//				System.out.print((char)ch);
//			}
			
			byte[] content = new byte[istream.available()];		// returns count of available bytes in stream
			istream.read(content);	// reading bytes from stream into array
			System.out.println(new String(content));	// converting byte array to string
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				istream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
