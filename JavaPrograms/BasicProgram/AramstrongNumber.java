package BasicProgram;

import java.util.Scanner;

// sum of cubes of digits of number is equal to number itself
public class AramstrongNumber {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int n=num;
	int digit;
	int arm=0;
	while(num!=0)
	{
		digit=num%10;
		num/=10;
		arm=arm+digit*digit*digit;
	}
	if(n==arm)
	{
		System.out.println("armstrong number");
	}
	else {
		System.out.println("not armstrong");
	}
}
}
