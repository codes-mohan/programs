package Info.java.lang.object;
/*
 * in String class equals() method is overridden for content comparision 
 * so it returns true eventhough objects are different
 */
public class equalsFORstring {
public static void main(String[] args) {
	String s1=new String("hello");
	String s2=new String("hello");
	System.out.println(s1.equals(s2)); // true// for other classes it will return false
													// to get true we must override equals method
	System.out.println(s1==s2);// fasle
		// == is reference comparission
	
}
}
