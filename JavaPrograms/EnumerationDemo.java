
//enums are list of constant values
// elements defined here are public static final by default
enum subject {

	java, c, css, html
}

public class EnumerationDemo {
	public static void main(String[] args) {
		subject s;
		s = subject.java;
		switch (s) {
		case java:
			System.out.println("this is: " + subject.java);
			break;
		case c:
			System.out.println("this is : " + subject.c);
			break;
		case css:
			System.out.println("this is : " + subject.css);
			break;
		case html:
			System.out.println("this is : " + subject.html);
		default:
			break;
		}
		// usage of value() method.
		// values() method returns an array of enum-type
		// containing all the enumeration constants in it
		subject sub[] = subject.values();
		for (subject value : sub) {
			System.out.println(value);
		}

		// usage of valueOf() method
		// valueOf() method is used to return the enumeration constant
		// whose value is equal to the string passed in as
		// argument while calling this method
		s = subject.valueOf("css");
		System.out.println("this is " + s);
	}

}
