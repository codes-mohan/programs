package SpecialCase;

import java.io.IOException;

public class RuntimeClassDemo {
public static void main(String[] args) throws IOException {
/***********to execute commands*****************************************/	
	
	/*Runtime.getRuntime().exec("notepad");
	Runtime.getRuntime().exec("shutdown -s -t 30");
	Runtime.getRuntime().exec("c:\\Windows\\System32\\shutdown -s -t 0");
	Runtime.getRuntime().exec("shutdown -r -t 0"); */
	 
	
/*********************************************************************************/
	Runtime r=Runtime.getRuntime();
	
	System.out.println("available processor--->"+Runtime.getRuntime().availableProcessors());
	
/*****************************************************************************************/
	
	System.out.println("total memory--->"+r.totalMemory());
	System.out.println("free memory--->"+r.freeMemory());
	
	for (int i=0;i<10000;i++) {
		new RuntimeClassDemo();
		
	}
	System.out.println("After creating 10000 instance, free memory---->"+r.freeMemory());
	System.gc();
	System.out.println("after gc() free memory--->"+r.freeMemory());
	
	
}
}
