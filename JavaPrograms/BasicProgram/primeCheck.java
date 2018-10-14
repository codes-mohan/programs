package BasicProgram;

import java.util.Scanner;

public class primeCheck {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	if(num==0 || num==1)
	{
		System.out.println("neither prime nor composite");
		System.exit(0);
	}
	int flag=0;
	for(int i=2;i<=num/2;i++) {
		if(num%2==0)
		{
			System.out.println("not a prime number");
			flag=1;
		}
	}
	if(flag==0)
	{
		System.out.println("prime number");
	}
	
}
}
