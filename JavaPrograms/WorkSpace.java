
public class WorkSpace {
	
	
	
	static int  test=10;
public static void main(String[] args) {
	/*int a[]=new int[] {1,5,4,2};
	for(int value:a) {
		System.out.println(value);
	}*/
	
	
	

	
	int test=5;
	System.out.println(WorkSpace.test);
	
int x=5;
int y=x++;
System.out.println(y); //here first x value is assigned to y 
						//then value of x is incremented
System.out.println(x);
int a=4;
int b=++a;
System.out.println("b: "+b +a); // here first a is incremented and then 
						//assigned to b

//--------------------------------------------------------------//

byte b1=10;
byte b2=10;
int b3=b1+b2;  // 10+10 will result in int value
byte b4= (byte) (b1+b2); // otherwise cast it
							// if we use increment operator here  
									// casting will done internally
System.out.println("b3: " +b3);
System.out.println("b4: "+b4);

//---------------------------------------------------------------------//

//System.out.println(10/0);   // in integral arithmetic there is no way to represent infinity
										// so it will throw ArithmeticException
System.out.println(10/0.0);  // but in floating point arithmetic there is way to represent infinity
								// +infinity and -infinity
System.out.println(-10/0.0f);
// System.out.println(0/0); //it(indeterminate form) is not defined for integral arithmetic	
											// so it will throw an exception
System.out.println(0.0/0.0); // output---> Nan // it won't throw an exception

//---------------------------------------------------------------------------------------------------------//




}
}

