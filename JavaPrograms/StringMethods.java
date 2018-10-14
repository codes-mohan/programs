
public class StringMethods {
public static void main(String[] args) {
	String str1=" hello this is mohan ";
	String str2="i'm from karnataka";
	String str3=" HELLO THIS IS MOHAN ";
	
	System.out.println("TO lowe case-->"+str3.toLowerCase());
	System.out.println("TO upper case-->"+str1.toUpperCase());
	
	String str4="hat";
	
	System.out.println("Replacement--->"+str4.replace('h', 'c'));
	
	System.out.println("Trimming--->"+str1.trim()+str3.trim());
	
	System.out.println("compare-->"+str1.equals(str3));
	System.out.println("compare--->"+str1.equalsIgnoreCase(str3));
	
	System.out.println("length--->"+str2.length());
	
	System.out.println("char at---->"+str2.charAt(1));
	
	System.out.println("compare to--->"+str1.compareTo(str2));
	System.out.println("compare to--->"+str1.compareTo(str3));
	
	
	String s1="equal";
	String s2="equal";
	System.out.println("compare to--->"+s1.compareTo(s2));
	
	System.out.println("concat--->"+str1.concat(str2));
	
	
	System.out.println("substring--->"+str1.substring(15));
	System.out.println("substring---->"+str3.substring(7, 12));
	
	System.out.println("index of--->"+str1.indexOf('m'));
	
	System.out.println("Valueof--->"+String.valueOf(true));


String string1=new String("hello");
String string2=string1.intern();
System.out.println(string2);
}
}
