

interface Myinterface{
	static {
		// static blocks are not allowed
	}
	
	{
		// instance block are not allowed
	}
	
	int interfacevar=10; // by default public static final // we must initialize 
	Myinterface()
	{
		// we cannot have constructor
	}
	// we know only requirements specifications
	// we don't know anything about implementations
	
	void concretemethod() {
		// we cannot have concrete methods
	}
	
	void method();  // public abstract by default
	
	
}
abstract class abstractclass{
	int abstractvar; // not public static int by default // need not to initialize

	static {
		//static blocks are allowed
	}
	{
		// instance block is allowed
	}
	
	abstractclass()
	{
		// we can have constructors
	}
	// we know about implementations but not completely
	abstract void abstratctmethod();  // not public abstract by default
	void concretemethod()
	{
		// we can have concrete methods
	}
	
	
}

public class AbstractVSinterface {
public static void main(String[] args) {

}

}
