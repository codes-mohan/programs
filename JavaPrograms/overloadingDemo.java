public class overloadingDemo {
	public static void main(String[] args) {
overloading o=new overloading();
o.test();
o.test(10);
o.test(15.25);
o.test(15,7);

	}
}

class overloading {
	public void test() {
		System.out.println("in parameter less method");
	}

	public void test(int a) {
		System.out.println("value of a-->" + a);

	}
	public void test(double b){
		System.out.println("value of b-->"+b);
	}
	public void test(int c,int d){
	System.out.println("value of c and d-->"+c+":"+d );
}
}