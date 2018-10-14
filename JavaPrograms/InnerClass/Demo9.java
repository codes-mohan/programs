package InnerClass;
// inner inner class

class outermost{
	class outer{
		class inner{
			void show()
			{
				System.out.println("inner class");
			}
		}
	}
}
public class Demo9 {
	public static void main(String[] args) {
		outermost o=new outermost();
		outermost.outer obj=o.new outer();
		outermost.outer.inner object=obj.new inner();
		object.show();
		
		// or
		new outermost().new outer().new inner().show();
	}

}
