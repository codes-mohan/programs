// first static blocks will executed then main
// this feature is added in 1.7 version
public class StaticBlockDemo {
static {
	System.out.println("inside the first static block");
}
public static void main(String[] args) {
	System.out.println("inside the main method");
}
static {
	System.out.println("inside the second static block");
}
}
