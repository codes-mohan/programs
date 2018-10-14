public class InterfaceDemo {
public static void main(String[] args) {
	class1 c1=new class1();
	class2 c2=new class2();
	c1.print();
	c2.print();
}
}

interface base {
	void print();
}

class class1 implements base {

	public void print() {
		System.out.println("in class 1 implementation");
	}
}

class class2 implements base {

	public void print() {
		System.out.println("in class 2 implementation ");

	}
}

