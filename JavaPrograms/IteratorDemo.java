import java.util.ArrayList;
import java.util.Iterator;
// it traverse element in forword direction
// if we need to access elements of collection class and 
// we also need to modify it 
// then use iterator
public class IteratorDemo {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<String>();
a.add("this");
a.add("is");
a.add("String");
Iterator<String> it=a.iterator();
while(it.hasNext())
{
		
	System.out.println(it.next());
	
}


}
}
