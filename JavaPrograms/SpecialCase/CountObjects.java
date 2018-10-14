package SpecialCase;

public class CountObjects {
	static int count=0;
	{ // instance block to do other things during object creation other than
		// initializing object
		count++;
	}
	CountObjects()
	{
		// constructor is to initialize object
	}
	
public static void main(String[] args) {
	CountObjects o1=new CountObjects();
	CountObjects o2=new CountObjects();
	CountObjects o3=new CountObjects();
	CountObjects o4=new CountObjects();
	CountObjects o5=new CountObjects();
System.out.println("number of objects created: "+count);
}
}
