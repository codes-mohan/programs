package CollectionsDemo;

import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	TreeMap t=new TreeMap<Integer,String>();
	
	t.put(1	,"one");
	t.put(2, "two");
	t.put(null, "null");  // it throws NullPointerException // can't have null key
									//can have null values
	

	System.out.println(t);

}
}
