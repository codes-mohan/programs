import java.util.Iterator;
import java.util.PriorityQueue;
	
public class PriorityQueueDemo {
public static void main(String[] args) {
	PriorityQueue<String> p=new PriorityQueue<>();
	System.out.println("<-----when the queue is empty----->");
	System.out.println();
	System.out.println("size: "+p.size());
	System.out.println("element at the head: "+p.poll());
	System.out.println("element at the head: "+p.peek());
	System.out.println("does the queue contains the string \"hello\": "+p.contains("hello"));
	System.out.println("<--------after loading element to queue--------->");
	System.out.println();
	p.add("eclipse");
	p.add("netbeans");
	p.add("notepad");
	System.out.println(p);
	// printing element using for each loop
	System.out.println("<----------------------------------------------->");
	System.out.println("\n print all elements using for each loop \n");
	for(String value:p)
	{
		System.out.println(value);
	}
	System.out.println("<---------------------------------------------->");
	System.out.println("\n printing all the elements using iterator \n");
	Iterator<String> it= p.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("-------------------------------- \n\n");
	System.out.println("is queue is empty: "+p.isEmpty());
	// adding elements in queue
	p.offer("hello");
	System.out.println(p);
}
}
