package SpecialCase;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Demo{
static int val=10;	
	private Demo()
	{
		
	}
	void method()
	{
		System.out.println("in method");
	}
	static {
		System.out.println("in static block--->class is loaded");
	}
}

public class ClassdotForName {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	
	Class c=Class.forName("SpecialCase.Demo");
	Constructor ctr=c.getDeclaredConstructor();
	ctr.setAccessible(true);
	Demo d=(Demo)ctr.newInstance();
	d.method();

	
	
	
	
}
}
