// complier won't check for unreachability in if-else 
	//it will check only in loops
public class Unreachability {
public static void main(String[] args) {
	while(true) {
		System.out.println("hello");
	}
	System.out.println("hi");  //unreachable
	if(true) {
		System.out.println("hello");
	}
	else {
		System.out.println("hi");
	}
}
}
