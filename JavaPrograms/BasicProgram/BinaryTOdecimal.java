package BasicProgram;

import java.util.Scanner;

public class BinaryTOdecimal {
public static void main(String[] args) {
	System.out.println("enter a binary number");
	Scanner sc=new Scanner(System.in);
	String binarystring=sc.nextLine();
	System.out.println("Decimal equivalent: "+Integer.parseInt(binarystring, 2));
}
}
