package Interface;

interface one{
	int i=1;
	private int b=10;  //illegal..only public static final allowed
	
	void show();  // by default it is public abstract
	
	void method();
	
}



interface two implements one{
	// one interface cannot implement another
}


interface three{
	
}

interface four extends one,three{
	// interface can extend one or more interface
}

// if we won't implement all methods
//make class abstract

public abstract class InterfaceDemo implements one{
	// order won't matter
	final static public int a;
	static final public int b;
	public final static int c;
	
	void show()   // this must be public // we cannot reduce access level of method during overriding
	{
		
	}
	
public static void main(String[] args) {
	System.out.println(i);
	
	i=i+1;  // i is final so can't change
System.out.println("hi");
}
}
