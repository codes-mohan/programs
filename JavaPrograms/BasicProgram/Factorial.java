package BasicProgram;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	/*int fact=num;
	for(int i=num-1;i>0;i--)
	{
	fact=fact*i;
	}
	System.out.println(fact);*/
	/*int fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);*/
	int res=factorial(num);
	System.out.println(res);
}
// not for 0
static int factorial(int num)
{
	if(num==1)
		return 1;
	else
	return num*factorial(num-1);
}
}
