package SpecialCase;

public class SwitchDemo {
static public void main(String[] args) {
	int x=10;
	 final int y=20;
	;   //semicolon is valid statement in java....it is empty statement
	
	switch(x)
	{
	case 10:
		System.out.println("10");
		break;
		/*
		 * we can write below 2 statements iff y is declare as final
		 */
	case y+2:
		System.out.println("22");
	case y:
		System.out.println("20");
	}
	
			
}
}
