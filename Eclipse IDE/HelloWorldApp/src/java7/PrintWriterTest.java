package java7;
import java.io.*;
public class PrintWriterTest {
	public static void main(String args[ ]) {
		try {
			PrintWriter out = new PrintWriter(new FileWriter("myAccount2.txt"));
			BankAccount aBankAccount = new BankAccount("LiuWei",2017);
			out.println(aBankAccount.getOwnerName());
			out.println(aBankAccount.getAccountNumber());
			out.println("$"+aBankAccount.getBalance());
			out.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error:Cannot open file for writing.");
		}catch(IOException e) {
			System.out.println("Error:Cannot write to file.");
		}
	}

}
