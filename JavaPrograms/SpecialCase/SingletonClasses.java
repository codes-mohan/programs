package SpecialCase;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class bank{
	static bank bankref=null;  // this is called as lazy initialization // it's not always works, so not recomonded
private	 bank()							// if we use this, we can violte singleton class b using multithreadings acess
	{
		System.out.println("object created");
	}
	public static bank getBankObj(){
		if(bankref==null)
		{
			bankref=new bank();
			
		}
		return bankref;}
	
		
	
	public void createAccount()
	{
		System.out.println("account created");
	}
}
public class SingletonClasses {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, Exception, SecurityException {
	bank b=bank.getBankObj();
	bank b1=bank.getBankObj();
	if(b.equals(b1))
	{
		System.out.println("equal");
	}
	b.createAccount();
	Class clazz =Class.forName("SpecialCase.bank"); // load class
	Constructor<bank> ctor=clazz.getDeclaredConstructor();
	ctor.setAccessible(true);
	bank b2=ctor.newInstance();
	if(b1!=b2)
	{
		System.out.println("new object is created");
	}
}
}

