package BasicProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddOrEven {
public static void main(String[] args) throws IOException {
	System.out.println("enter a number");
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	String str=br.readLine();
	int num =Integer.parseInt(str);
	if(num%2==0)
	System.out.println("you have entered an even  number");
	else {
		System.out.println("you have entered an odd number");	
	}
	
}
}
