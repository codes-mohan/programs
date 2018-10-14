package SpecialCase;

public class ForLoop {
public static void main(String[] args) {
	int i=0;
	for(System.out.println("hi");i<1;i++) // hi
										// hello
		System.out.println("hello");
	

	for(i=0;i<1;System.out.println("hi"))
		System.out.println("hello");      //hello
										// hi      infinitely
}
}
