package oval;
import java.util.*;
public class Text26 {
	public static void main(String[]args) {
		Text26 mt = new Text26();
		int initNum = 9, res =0;
		for( int i= 1;i<=initNum;i++) {
			for(int k =1;k<i;k++)
				System.out.print("    ");
			for(int j =i;j<=initNum;j++) {
				res=i*j;
				mt.printFormula(i,j,res);
			}
			
		}
	}
	public void printFormula(int i,int j,int res) {
		System.out.print(i+"*"+j+"="+res+"\t");
	}
	

}
