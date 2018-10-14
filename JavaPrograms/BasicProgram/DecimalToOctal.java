package BasicProgram;

import java.util.Scanner;

public class DecimalToOctal {
public static void main(String[] args) {
	System.out.println("enter a decimal number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int n=num;
	//---------------------method 1-----------------------------//
	String octal=Integer.toOctalString(num);
	System.out.println("octal value is "+octal);
	
	//-----------------method 2------------------------------------//
	
	int rem;
	String str="";
	char dig[]= {'0','1','2','3','4','5','6','7'};
	while(n!=0) {
		rem=n%8;
		str=dig[rem]+str;
		n/=8;
		
	}
	System.out.println("octal value is : "+str);
	
}
}
