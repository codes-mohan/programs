package BasicProgram;

import java.util.Scanner;

// to find area and circumference
public class circle {
public static void main(String[] args) {
	System.out.println("enter the value of radius of the circle");
	Scanner s=new Scanner(System.in);
	double r=s.nextDouble();
	double area=Math.PI*r*r;
	System.out.println("area of the circle= "+area);
	double circum=Math.PI*2*r;
	System.out.println("circumference= "+circum);
	
}
}
