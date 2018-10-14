import BasicProgram.WorkBook;

public class practice  extends WorkBook{
	protected void show()
	{
		
		System.out.println("hello");
	}
public static void main(String[] args) {
	
	
	// WorkBook o=new WorkBook(); // protected constructor won't allow this instantiation
	 //o.show();
	
/*
 * protected members can be accessed only through inheritance in other package 
 * so here we can access show protected method and protected constructor of super class by using child class reference 
 * and child class object
 */
	
	practice o1=new practice();
	o1.show();
	
	
	
}
}
