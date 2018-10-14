package Info.java.lang.object;
/*
 * every wrapper classes except Character class contains a static parsexxx
 * method to convert String to corresponding primitive
 */
public class parsexxx {
public static void main(String[] args) {
	int i=Integer.parseInt("10");
	System.out.println(i);
	
	boolean bool=Boolean.parseBoolean("true");
	System.out.println(bool);
	double d=Double.parseDouble("10.54");
	System.out.println(d);
	
	int integer=Integer.parseInt("1010",2); // binary to decimal
	System.out.println(integer);
	
	String s1=Integer.toString(75,2);  // decimal to binary
	System.out.println(s1);
}
}
