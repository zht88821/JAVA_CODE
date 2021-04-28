package java7;
import java.io.*;
public class FileOutputStreamTest {
	public static void main(String args[ ]) {
		try {
			FileOutputStream out = new FileOutputStream("myFile.dat");
			out.write('H');
			out.write(69);
			out.write(76);
			out.write('L');
			out.write('o');
			out.write('!');
			out.close();
					
		}catch (FileNotFoundException e) {
			System.out.println("Error:Cannot open file for writing.s");
		
		}catch(IOException e) {
			System.out.println("Error:Cannot write to file.");
		}
		
	}

}
