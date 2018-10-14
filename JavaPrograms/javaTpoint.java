

public class javaTpoint {
public static void main(String[] args) {
Thread t=new Thread(new thread());
t.start();
System.out.println("end of method");
}
	}
class thread implements Runnable{
	public void run(){
		System.out.println("run");
		throw new RuntimeException("problem");
	}
	
}

/*
 public class javaTpoint {
public static void main(String[] args) {
Thread t=new Thread(new thread());
t.start();
System.out.println("end of method"); //in normal cases it will not printed. since it's thread operation it will run
}
	}
class thread implements Runnable{
	public void run(){
		System.out.println("run");
		throw new RuntimeException("problem");
	}
	
}

output-->

run
java.lang.RuntimeException:problem
end of method
 */
/*
 *public static void main(String[] args) {
try{
	return;
}finally{
	System.out.println("finally");
}
}
only way to terminate executing finally is 
System.exit(0);
output--->finally
 */
/*
 
public class javaTpoint {
public static void main(String[] args) {

try{
	method();
	System.out.println("not printed");
}catch(Error e){
	System.out.println("not print");
}finally{
	System.out.println("print");
}
System.out.println("out of try catch");
}

private static void method() {
	throw new Error();
	
}
}

output--->
print

finally block is executed before exiting with the error
in method error is thrown but not handled.


 */

/*
 public class javaTpoint {
public static void main(String[] args) {

try{
	method();
	System.out.println("not printed");
}catch(Error e){
	System.out.println("not print");
}finally{
	System.out.println("print");
}
System.out.println("out of try catch");
}

private static void method() {
	throw new Error();
	
}
}

output--->

not print
print
out of try catch

 */
/*
 public static void main(String[] args) {

	String a=" hi ";
	String b=" hello ";
	System.out.println(a.trim()+b.trim());
}
}


output--hihello
 */

/*
 public static void main(String[] args) {
	int []x=new int[5];
	for(int i=0;i<x.length;i++){
		System.out.println(x[i]);
	}
}

output
0
0
0
0
0
 */
/*
 
public class javaTpoint {
	public javaTpoint(){
		this((byte) 10);//this(4) gives an error.
	}
	public javaTpoint(byte var){//for this(4) chaange this to int
		System.out.println(var);
	}
public static void main(String[] args) {
	
	javaTpoint t=new javaTpoint();
	
	


}
 */

/*


public class javaTpoint {
	public javaTpoint(){
		System.out.println("constructor");
	}
	static{
		System.out.println("static");
	}
	{
		System.out.println("instance");
	}
	
	public static void main(String[] args) {
		 javaTpoint j= new javaTpoint();
		
	}
}



output:
static 
instance
constructor
*/

