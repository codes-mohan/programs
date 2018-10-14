
// converting value of one type to another type is type conversion
//2 types
//implicit==widening  ---it is automatic
//explicit==narrowing

public class ImplicitCasting {
	public static void main(String[] args) {
		int i = 100;	
	      long l = i;	//no explicit type casting required  
	      float f = l;	//no explicit type casting required  
	      System.out.println("Int value "+i);
	      System.out.println("Long value "+l);
	      System.out.println("Float value "+f);
	}

}
