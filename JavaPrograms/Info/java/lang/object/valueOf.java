package Info.java.lang.object;

/*
 * we can use valueOf() method to create wrapper object for the given
 * primitive or string. this method is alternative to constructor
 * 
 */

public class valueOf {
public static void main(String[] args) {
	int primitive=40;
	
	Integer wrapper=Integer.valueOf(primitive);
	
	System.out.println(wrapper);
	
	String string="string";
	
	String wrapperstring=String.valueOf(string);
	System.out.println(wrapperstring);
	
	System.out.println(string instanceof String);
	
	
	char ch='a';
	Character wrapperch=Character.valueOf(ch);
	System.out.println(wrapperch);
}
}
