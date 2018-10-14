package SpecialCase;
// we can use System.gc()

class garbagedemo{
	
	// put finalize method in class whose object is dereferenced
	public void finalize() 
	{
		System.out.println("garbage collected");
		System.out.println(10/0);
	}
	
}
public class GarbageCollectorDemo {
public static void main(String[] args) {
	garbagedemo d=new garbagedemo();
	System.out.println(d);
	  d.finalize();  // we can explicitly call finalize 
					// but it is normal method calling, object will not destroy here
	
	// program will abruptly end here because when method is called
	// that throws exception which is not handled
	
	
	d=null;
	// if we comment line 18, gc will call finalize anyway, and exception which is uncaught 
			// will be ignored
	
	
	System.gc();
	
}

}
