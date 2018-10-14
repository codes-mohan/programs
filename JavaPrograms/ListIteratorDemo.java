import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
public static void main(String[] args) {
	ArrayList<String> a=new ArrayList<>();
	a.add("c");
	a.add("c++");
	a.add("java");
	a.add("python");
	ListIterator<String> li=a.listIterator();
	System.out.println("\n <----------print element in forword direction---------------->\n");
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	
	System.out.println("\n <----------------print element in backword direction------------>");
	while(li.hasPrevious()) {
		System.out.println(li.previous());
	}
	
	System.out.println("\n <---------checking other method------------->");
	System.out.println(li.hasNext());
	System.out.println(li.hasPrevious());
	li.remove(); // remove first object
	System.out.println(li.nextIndex());
	System.out.println(li.previousIndex());
	while(li.hasNext()) {
		System.out.println(li.next());
	}
}
}
