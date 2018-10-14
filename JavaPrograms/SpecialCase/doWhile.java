package SpecialCase;

public class doWhile {
public static void main(String[] args) {
	/*do {
		System.out.println("helllo");
	} while (true);
	
	System.out.println("helllo");  // error ---unreachable
}*/
	int x=1,y=2;
do {
	System.out.println("friend");
} while (x<y);	
System.out.println("enemy");

/*
 * Here at the compile time compiler thinks that x and y both are variables and its value can be changed and that will gives false to the while loop.
 *  Which gives the chance to print ENEMY that’s why compiler did not throw any compile time error.
 */
	


do 

{
	
}
    while (true);
        ;
System.out.println("HELLO");
/*
 * without curly braces we can take a statement which cannot be declarative but 
 * if we are not specifying any statement and not mentioning any curly braces then compiler will give an error saying Error: ; expected.
 */
}	
}
