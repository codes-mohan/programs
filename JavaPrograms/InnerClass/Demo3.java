package InnerClass;

class outer{

	static void show()
	{
		
	}
class inner{
	// non-static inner class can never have static declarations
	//show(); // we can't access outer class method, in local inner class
	int a=10;
	
}
}
public class Demo3 extends outer {
public static void main(String[] args) {
outer o=new outer();


inner obj= o.new inner(); // it will give error if we won't extend outer class
							// if the inner class is static, it will give error
							//if inner class is private, it will give error


System.out.println(obj.a);
}
}
