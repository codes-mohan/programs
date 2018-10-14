class test{
	int a;
	void display() {
		System.out.println(a);
	}
}
public class StaticChange {
public static void main(String[] args) {
	test t1=new test();
	t1.a=10;
	System.out.print("value of a in first class=");
	t1.display();
	System.out.print("\n"+"value of a in second class=");
	test t2=new test();
	t2.display();

}
}

/*
 value of a in first class=10

value of a in second class=0

here value is not changed in second class  
because when object is created only copy of instance variables will be used by objects, not the original value

To use original value or to share one variable among all objects 
declare variable as static  
*/
