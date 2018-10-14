package Info.java.lang.object;
// convert wrapper object to primitive
public class xxxValue {
public static void main(String[] args) {
	Integer i=new Integer(10);
	System.out.println(i.byteValue());
	System.out.println(i.shortValue());
	System.out.println(i.intValue());
	System.out.println(i.longValue());
	System.out.println(i.floatValue());
	System.out.println(i.doubleValue());
	//System.out.println(i.toString());
	//System.out.println(i.valueOf(i));
	System.out.println(i+"4");
	
	Character ch1=new Character('a');
	char ch2=ch1.charValue();   // convert Character object to char primitive
	System.out.println(ch2);
}
}
