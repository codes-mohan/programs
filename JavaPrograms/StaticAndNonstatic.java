// static  variable can be accessed directly by static area
// but non static variable cannot be accessed by static area directly

// non static areas can access both static and non static variable
public class StaticAndNonstatic {
	static int staticvar=10;
	int nonstaticvar=20;
	
void nonstaticmethod()
{
	System.out.println("sttaic var is accessed by nonstatic method: "+staticvar);
	System.out.println("non static var is accessed by non static method: "+nonstaticvar);
	
}

static void  staticmethod(StaticAndNonstatic s) {
	System.out.println("static var is accessed by static method: "+staticvar);
	System.out.println("non stattic variable can't be accessed directly by static method");
	System.out.println("<------accessing non static var indirectly");
	
	System.out.println(s.nonstaticvar);
}

	
public static void main(String[] args) 
{
	StaticAndNonstatic s=new StaticAndNonstatic ();
	staticmethod(s);
	
}
}
