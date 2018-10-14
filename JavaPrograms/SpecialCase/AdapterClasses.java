package SpecialCase;
 /*adapter class is a simple java class that implements an interface 
 only with empty implementation for every method
 
 if we implement an interface we have to provide implementation for every 
 methods whether it is required or not.
 this increases the length of the code and reduces the readability
 
 we can resolve this problem by using adapter classes
 
 here, instead of implementing an interface we will extend an adapter class
then we will provide implementation for required methods but not for all methods in interface

this approach decreases length of the code and improves readability*/

interface myinterface{
	void method1();
	void method2();
	void method3();
	void method4();
	void method5();
}
 class AdapterClass implements myinterface{

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method5() {
		// TODO Auto-generated method stub
		
	}
	 
 }

public class AdapterClasses extends AdapterClass {
	@Override
	public void method1()
	{
		System.out.println("implemented only one method");
	}
public static void main(String[] args) {
	 AdapterClasses a=new  AdapterClasses();
	 a.method1();
}
}
