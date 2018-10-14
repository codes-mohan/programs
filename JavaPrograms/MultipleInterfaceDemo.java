public class MultipleInterfaceDemo {
	public static void main(String[] args) {
		class3 c1=new class3();
		c1.firstMethid();
		c1.secondMethod();
	}
}

interface first {
	public void firstMethid();
}

interface second {
	public void secondMethod();
}
class class3 implements first,second{

	public void secondMethod() {
		System.out.println("in second method");
	}

	public void firstMethid() {
		System.out.println("in first method");
		
	}
	
}
