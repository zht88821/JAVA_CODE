package java7;
import java.io.*;
public class BufferedReaderTest {
	public static void main(String args[ ]) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("myAccount2.txt"));
			BankAccount aBankAccount = new BankAccount();
			aBankAccount.setOwnerName(in.readLine());
			aBankAccount.setAccountNumber(Integer.parseInt(in.readLine()));
			in.read();           //读取$
			aBankAccount.deposit(Float.parseFloat(in.readLine()));
			in.close();
			System.out.println(aBankAccount);
			System.out.println(aBankAccount.getOwnerName()+""+aBankAccount.getAccountNumber()+""+aBankAccount.getBalance());
			
			
		} catch(FileNotFoundException e) {
			System.out.println("Error:Cannot open file for reading.");
		}catch(EOFException e) {
			System.out.println("Error:EOF encountered,file may be corrupted.");		
		}catch(IOException e) {
			System.out.println("Error:Cannot read from file.");
		}
	} 

}
