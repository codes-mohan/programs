



public class StringDemo {
public static void main(String[] args) {
	//declarations
	String str1="mohan";
	String str2=str1;
	
	String str3=new String("hello");
	String str4=new String(str1);
	//change the fourth string 
	str4=str4.concat(" tth");
	System.out.println("first string: "+ str1);
	System.out.println("second string: "+ str2);
	System.out.println("third string: "+ str3);
	System.out.println("fourth string: "+ str4);
	System.out.println("first string: "+ str1);
	
	String s1="hello";
	s1.concat("mohan");
	System.out.println(s1);  // this will print hello only
	//because String objects are immutable 
	//once created can't be changed.

// comparing strings
	String str5=new String("mohan");
	
// string str1="mohan"

System.out.println(str1==str5);  // both are equal but still it prints false
//because str5 uses new and hence it is stored in non pool memory
//but str1 is stored in string pool in heap

String str6="mohan";
System.out.println(str1==str6); // prints true  because both are in string pool
String str7=new String("mohan");

System.out.println(str5==str7); //though both are in same non pool memory gives false

//but equals method prints true ---which is correct
System.out.println(str5.equals(str7));

System.out.println(str1.equals(str6)); // true both are in string pool heap

System.out.println(str1.compareTo(str6)); //prints 0 --both are equal

System.out.println(str5.compareTo(str7)); // prints 0--both are equal
System.out.println(str3.equals(str1)); // false--not equal
System.out.println(str3.compareTo(str1)); // str3 is less on length so prints -ve value

//string functions

String s="hello";
System.out.println("length: "+s.length());
String t="HELLO";
System.out.println(s.equalsIgnoreCase(t));
System.out.println(t.toLowerCase());
System.out.println(t.charAt(0));
System.out.println(t.substring(0, 2));
String str="  hello ";
System.out.println(str.trim());
System.out.println(t.replace('H',' ' ));
System.out.println(t);
System.out.println(s.indexOf("e"));
}
}
