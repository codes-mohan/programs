package BasicProgram;

import java.util.Scanner;

public class PrimeChecker {
	static int i;
public static void main(String[] args) {
	
	while(true) {
	System.out.println("enter a number");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	if(num==0 || num==1)
	{
		System.out.println("neither prime nor composite");
	}
	
	for( i=2;i<num;i++)
	{
		if(num%i==0)
		{
			System.out.println("not a prime nunber");
			break;
			
		}
		}

	if(num==i) {
	System.out.println("prime number");
	}
	}
	
}
}

