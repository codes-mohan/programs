import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
public static void main(String[] args) {
	
	Stack<Integer> s=new Stack<>();
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	System.out.println(s);
	Iterator<Integer> it=s.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
		
	}
	// remove element at the top of the stack
	// last in first out
	//so removed elements will be those of elements which added last
	// i.e top of stack elements
	s.pop();    
	s.pop();
	System.out.println("<--------------After pop operation------------->");
System.out.println("\n");
Enumeration<Integer> e=s.elements();
while(e.hasMoreElements()) {
	System.out.println(e.nextElement());
}
System.out.println("element at the top of stack");
System.out.println(s.peek());
System.out.println("searching the object \n");
System.out.println("position of object: "+s.search(1));
int value=s.search(0);
if(value<0)
{
	System.out.println(value);
	System.out.println("the object is not found");
}
}
}
