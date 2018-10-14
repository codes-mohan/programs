package Info.java.lang.object;

import java.lang.String;
import java.lang.System;

/*
 * case1: toString overridden but hashCode is not
 * 		here toString just print whatever is return from overrirdden method
 * case1: toString is not overridded but hashcode is overridde
 * 			here toString call overridden hashcode to print hashcode from toString method of Object class
 * case3: both are not overridded
 * 			here Objcet class toString method is called which calls hashCode method of Object class to print hashCode
 * case4: both are overridded
 * 			toString will not call hashCode  
 */
class compare{
	String name;
	int age;
	
	public compare(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return name+"is "+age+" years old";
	}
	public int hashCode()
	{
		return age;
		
	}

}

public class toStringVShashCode {
public static void main(String[] args) {
	compare c=new compare("mohan",21);
	System.out.println(c);
	System.out.println("hashcode: "+c.hashCode());
	
}
}
