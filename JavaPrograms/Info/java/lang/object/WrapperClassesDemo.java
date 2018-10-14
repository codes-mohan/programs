package Info.java.lang.object;
/*
 * main objectives of wrapper classes are:
 * 
 * 1. to wrap primitives into objects, so that we can handle primitive just like objects
 * 2. to define several utility functions which are required for the primitives
 *
 * toString() is overrided to return its content in all wrapper classes
 * 
 * equals() method is overridded for content comparision in all wrapper classes
 */
public class WrapperClassesDemo {
public static void main(String[] args) {
	//-------------------Integer-------------------//
	/****both strings and number allowed**************/
	
	Integer int1=new Integer(10);
	System.out.println("integer value: "+int1);
	Integer int2=new Integer("10"); 
	System.out.println("integer value: "+int2);
	/*Integer int3=new Integer("ten"); // NumberFormatException
	System.out.println("integer value: "+int3);*/
	
	/***********************Boolean*******************************/
		// both strings and bool allowed
	Boolean b1=new Boolean(true);
	System.out.println("boolean value: "+b1);
	
	Boolean b2=new Boolean(false);
	System.out.println("boolean value: "+b2);
	
	Boolean b3=new Boolean("yes");
	System.out.println("boolean value: "+b3);  // false

	Boolean b4=new Boolean("no");
	System.out.println("boolean value: "+b4);  ///false
	
	System.out.println(b3.equals(b4));  //true

	/******************Character***************************************/
		// only char allowed not string//
	
	Character c1=new Character('a');
	System.out.println(c1);
	
	Character c2=new Character("ab"5);
	System.out.println(c2);


}

}
