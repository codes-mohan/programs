package SpecialCase;
/*
 * final modifier is applicable for variable whereas immutability concept is applicable for objects
 * 
 * if a reference variable is declared as final then we can't perform reassignment for the reference variable
 * but here we can perform any changes in that object
 * 
 * that is by declaring reference variable as final we won't get any immutability nature
 * 
 * final and immutability both are different concepts 
 */
public class finalVSimmutability {
public static void main(String[] args) {
	final int var=10;
	final StringBuffer sb=new StringBuffer("hello");
	sb.append(" hi");
	System.out.println(sb);
	sb=new StringBuffer("new"); // can't perform reassignment
}
}
