package BasicProgram;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {
	System.out.println("enter the number terms for series");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int first=0;
	int second=1;
	int next;
	for(int i=0;i<num;i++)
	{
		System.out.println(first);
		next=first+second;
		first=second;
		second=next;
	}
	
	// using recursion
	int limit=10;
	for(int j=0;j<limit;j++)
	{
		System.out.println(fib(j));
	}
	
}

private static int fib(int j) {
	// TODO Auto-generated method stub
	if(j==0)
		return 0;
	if(j==1)
		return 1;
	else
		return fib(j-1)+fib(j-2);
				
}
}
