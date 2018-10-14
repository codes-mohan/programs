package Info.java.lang.object;
/*
 * in StringBuffer class equals method is not overrided for content comparission
 * 
 * so equals here do reference level comparission
 * so though content is same if objects are different equals returns false
 */
public class StringBufferEquals {
public static void main(String[] args) {
	StringBuffer sb1=new  StringBuffer("hello");
	StringBuffer sb2=new StringBuffer("hello");
	System.out.println(sb1.equals(sb2)); // false
}

}
