package z1;

public class BankTester{
	public static void main(String args[]) {
		BankAccount myAccount=new BankAccount();
		
		
		myAccount.ownerName="Wangli";
		myAccount.accountNumber=100234;
		myAccount.balance=2000.00f;
		
		System.out.println("ownerName="+myAccount.ownerName);
		System.out.println("accountNumber="+myAccount.accountNumber);
		System.out.println("balance="+myAccount.balance);
		
	}
}
