package z2;
import java.util.Scanner;

public class IntDouble {
	public static void main(String[]args) {
		int age;
		double weight,height,bmi;
		Scanner scan=new Scanner(System.in);
		System.out.print("��������������:");
		age=scan.nextInt();
		System.out.print("��������������(����):");
		weight=scan.nextDouble();
		System.out.print("�������������(��):");
		height=scan.nextDouble();
		bmi=weight/(height*height);
		System.out.println("BMI:"+bmi);
		
	}

}
