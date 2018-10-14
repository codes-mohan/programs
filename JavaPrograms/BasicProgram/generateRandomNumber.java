package BasicProgram;

import java.util.Random;
import java.util.Scanner;

public class generateRandomNumber {
public static void main(String[] args) {
	Random r=new Random();
	System.out.println("enter the maximum range");
	Scanner s=new Scanner(System.in);
	int maxrange=s.nextInt();
	
	for(int i=0;i<5;i++)
	{
		System.out.println(r.nextInt(maxrange));
		System.out.println(r.nextInt(200)); // range is between 0 and 200
	}
}
}
