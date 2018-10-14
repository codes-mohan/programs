package SpecialCase;

import java.util.Scanner;

// loading class at runtime
public class Dynamic_Class_Loading {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	
	String path="SpecialCase";
	String clsname;
	
	System.out.println("enter the class name");
	
	Scanner sc=new Scanner(System.in);
	
	clsname=sc.nextLine();
	// first method
	
	System.out.println("<--------------first method--------------->");
	
	Class cls=Class.forName(path+"."+clsname);
	Object obj=cls.newInstance();
	((Animals)obj).run();
	
	// second method
	System.out.println();
	System.out.println("<---------------second method----------------------->");
	System.out.println("enter the class name");
	clsname=sc.nextLine();
	ClassLoader clsloader=ClassLoader.getSystemClassLoader();
	Class cls1=clsloader.loadClass(path+"."+clsname);
	Object obj1=cls1.newInstance();
	((Animals)obj1).run();
	
	// static class loading
	System.out.println();
	System.out.println("<------------static class loading------------------>");
	Animals anm=new Tiger();
	anm.run();
	
}
}
