package BasicProgram;

import java.util.Scanner;

public class PalindromeNumber {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int digit;
	int rev=0;
	int num=sc.nextInt();
	int n=num;
	
	while(num!=0)
	{
		digit=num%10;
		rev=rev*10+digit;
		num/=10;
	}
	if(rev==n)
	{
		System.out.println("palindrome");
	}
	else
	System.out.println("not palindrome");
	
	
	
	
	
	
	
	
	
	
	
	
}
}
