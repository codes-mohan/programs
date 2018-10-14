/*  interface can extend another interface 
interface actor{
 
	void movies();
}
interface style extends actor{
	void bestStyle();
}


public abstract  class InterfaceDemo implements style {
public static void main(String[] args) {
	
	
}
}
*/
interface run{
 
	void running();
}
interface eat{
	void eating();
}

// interface supports multiple inheritance
public   class InterfaceDemo implements run,eat {
public static void main(String[] args) {
	InterfaceDemo d=new InterfaceDemo();
	d.eating();
	d.running();
	
}

@Override
public void eating() {
	System.out.println("eating");
	
}

@Override
public void running() {
	System.out.println("running");
	
}
}

