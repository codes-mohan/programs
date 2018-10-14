package SpecialCase;

import java.util.Date;

/*java application can communicate with jvm by using Runtime object

Runtime class is singleton class in java.lang package 

we can create Runtime object by using factory method getRuntime()
*/

/*
 * here gc() is non static method
 * 
 * but in System class gc() is static method
 */
public class RuntimeGarbageDemo {
public static void main(String[] args) {
	Runtime r=Runtime.getRuntime();
	System.out.println("total memory of the heap: "+r.totalMemory());
	System.out.println("free memory: "+r.freeMemory());
	for(int i=0;i<10000;i++)
	{
		Date d=new Date();
		d=null;
	}
	System.out.println("available processors: "+r.availableProcessors());
	System.out.println("free memory: "+r.freeMemory());
	
	r.gc();  // Runtime.getRunime.gc();
	// after calling gc
	// it will remove unused objects and free the memory
	System.out.println("free memory: "+r.freeMemory());
}
public void finalize()
{
	// here finalize will not be called by gc()
	System.out.println("garbage collected");
}
}
