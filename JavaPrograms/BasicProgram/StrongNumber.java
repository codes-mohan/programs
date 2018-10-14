package BasicProgram;

import java.util.Scanner;

//if the sum of factorial of individual digit is equal to number itself then
// that number is called as strong number
public class StrongNumber {
public static void main(String[] args) {
	System.out.println("enter any number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int n=num;
	int digit = 0;
	while(num!=0)
	{
		digit=num%10;
		digit=digit+factorial(digit);
		num/=10;
	}
	if(digit==n)
	{
		System.out.println("it is a strong number");
	}
	else
		System.out.println("it is not a strong number");
	
}

public static int factorial(int num)
{
	if(num==1)
	{
		return 1;
	}
	else
	return num*factorial(num-1);
	
}

}
