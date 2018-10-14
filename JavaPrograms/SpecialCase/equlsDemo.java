package SpecialCase;
// equals methos is for content comparision
// == is meant for reference level comparision
public class equlsDemo {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = new String("hello");

		/*
		 * System.out.println(s1==s2); //false but it is true
		 * System.out.println(s1.equals(s2)); // true
		 */

		s1=s2; //two objects pointing to same location
		//so == prints true
		
		System.out.println(s1==s2);
		String s=new String("hello");
		System.out.println(s==null);   //false
		String snew=null;  //snew is not pointing to any object
		System.out.println(snew==null);  //true 
	}
	
}
