
import java.util.LinkedList;


public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String>list=new LinkedList<String>();
	list.add("cat");
	list.add("dog");
	list.add("tiger");
	list.add("rabbit");
	list.remove(0);
	list.add(null);
	list.set(0,"new");  //replacing
	System.out.println("values in the list-->"+list);
	
	
}


}
