package SpecialCase;

import java.io.Console;
public class ConsoleDemo {

  
   
public static void main(String args[]) throws InterruptedException{    
Console c=System.console();    
System.out.println("Enter your name: "); 
Thread.sleep(5000);
String n=c.readLine();    
System.out.println("Welcome "+n);    
}    
}  