package java7;
import java.io.*;
class CharInput {
	public static void main(String args[ ])throws IOException{
		String s;
		InputStreamReader ir;
		BufferedReader in;
		ir = new InputStreamReader(System.in);
		in = new BufferedReader(ir);
		while((s=in.readLine())!=null)
			System.out.println("Read:"+s);
			
	}

}
