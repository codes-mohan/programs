package BasicProgram;

import java.util.Scanner;

// convert given number of days into months and days
//months------>30days
public class DayMonthDemo 
{
public static void main(String[] args) {
	System.out.println("enter the number of days");
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int months=num/30;
	int days=num%30;
	System.out.println("number of months= "+months+ " "+"number of days= "+days);
}
}
