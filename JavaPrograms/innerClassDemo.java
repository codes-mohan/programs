
class outer {
	innerClass in = new innerClass(); // if we don't create this object

	// outer o=new outer(); this statement can't access constructor of inner
	// class
	public static class innerClass {
		public innerClass() {
			System.out.println("in inner class constructor");
		}
	}
}

public class innerClassDemo {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		outer o = new outer();
		@SuppressWarnings("unused")
		outer.innerClass oi = new outer.innerClass();// this statement works
														// because innerClass is
														// static
		// that is innerClass is outer class content
		// if we remove static it will cause error

	}
}