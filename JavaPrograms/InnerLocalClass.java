//non static inner class defined inside the method of outer class------->local inner class

class outerclass{
	void method()
	{
		class innerclass{
			void show()
			{
				System.out.println("inner class");
			}
			
		}
		innerclass i=new innerclass();
		i.show();
	}
}
public class InnerLocalClass {
public static void main(String[] args) {
	outerclass o=new outerclass();
	o.method();
}
}
