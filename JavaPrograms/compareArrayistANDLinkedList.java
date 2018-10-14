import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class compareArrayistANDLinkedList {
public static void main(String[] args) {
	ArrayList<Integer>list1=new ArrayList<Integer>();
	LinkedList<Integer>list2=new LinkedList<Integer>();
	
 // if the method is not static following lines throws errors
	//make the method static or create the objects and call the method through object
test(list1);
   test(list2);
}
public static void test(List<Integer> list){
	long start=System.currentTimeMillis();
	
	for(int i=0;i<9999;i++){
		list.add(i);
	}
	list.get(12);
	long stop=System.currentTimeMillis();
	System.out.println("time taken-->"+(stop-start)+" ms");
	
}
}
