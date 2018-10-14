package InnerClass;
// inner class with no identity, we can use this to implement interface
// test.class and test$1.class are generated
// normally for inner class, class files are
// outer.class and outer$inner.class

interface hello{
	void show();
}
public class AnonymousInnerClass {
public static void main(String[] args) {
	// hello h=new hello(); //we cannot instantiate interfaces
	
	hello h=new hello() {

		@Override
		public void show() {
			System.out.println("implemented method");
			
		}
		
	};
	h.show();
	
}
}
