package BasicProgram;

import java.util.Scanner;

public class GCDandLCM {
public static void main(String[] args) {
	System.out.println("enter two number");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
	// ---------------to find GCD-----------------------------------//
	int gcd=1;
	for(int i=1;i<=a && i<=b;++i)
	{
		if(a%i==0 && b%i==0) {
			gcd=i;
		}
	}
	System.out.printf("GCD of %d and %d is %d",a,b,gcd);
	
	
	//-------------------to find LCM------------------------------------------//
	int lcm=a>b?a:b;
	while(true) {
		if(lcm%a==0 && lcm%b==0)
		{
			System.out.printf(" \n lcm of %d and %d is %d",a,b,lcm);
			break;
		}
		++lcm;
		
	}
		
		}
}
