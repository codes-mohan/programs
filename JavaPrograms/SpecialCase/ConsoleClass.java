package SpecialCase;

import java.io.Console;

public class ConsoleClass {
public static void main(String[] args) {
	System.out.println("enter the password");
String passwd=System.console().readLine();	


	System.out.println("entered password is: "+passwd);
}
}
