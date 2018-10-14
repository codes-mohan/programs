package InnerClass;

class superclass {
	public void show() {
		System.out.println("first");
	}
}

public class AnonymousClass {
	public static void main(String[] args) {
		superclass s = new superclass() {
			//first anonymous class
			public void show()
			{
				System.out.println("second");
			}
		};
// normal class
		superclass s1 = new superclass() ;
				s1.show();
		
	// second anonymous class

				
	superclass s2 = new superclass() {
			public void show()
			{
				System.out.println("third");
				
			}
	};

	s.show();
	s1.show();
	s2.show();
	
	System.out.println(s.getClass().getName()); //AnonymousClass$1
	System.out.println(s1.getClass().getName()); // superclass
	System.out.println(s2.getClass().getName()); // AnonymousClass$2

	
	
	}
	
}