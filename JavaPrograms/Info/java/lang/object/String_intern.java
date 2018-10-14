package Info.java.lang.object;
/*
 *  by using heap object reference, if we want to get corresponding SCP object, then we should go for intern() method
 * SCP----->String constant pool 
 */
public class String_intern {
public static void main(String[] args) {
	String s1=new String("hello");
	String s2=s1.intern();
	System.out.println(s1.equals(s2)); // true
	System.out.println(s1==s2);  // false
	
	String s3="hello";
	System.out.println(s2==s3); // true ---> both are SCP
}
}
