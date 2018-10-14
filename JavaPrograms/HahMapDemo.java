import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HahMapDemo {
public static void main(String[] args) {
	HashMap<Integer,String> h=new HashMap();
	h.put(1,"one");
	h.put(2,"two");
	h.put(3,"three");
	System.out.println("\n <------------------normal printing------------>\n");
	System.out.println(h);
	
	System.out.println("\n <------------using Map.Entry---------------->");
	Set< Map.Entry< Integer,String> > st = h.entrySet();    //returns Set view
	for(Map.Entry<Integer, String> m:st) {
		System.out.print("key: "+m.getKey());
		System.out.println(":: value: "+m.getValue());
	}
	/*
	 
	 this will work only for hashtable
	 because keys() method is present for hshtable and not for hashmap
	System.out.println("\n <-----------------using enumeration---------------->");
	@SuppressWarnings("rawtypes")
	Enumeration e=h.keys();
	
	while(e.hasMoreElements())
	{
		int key=(int)e.nextElement();
		System.out.println("key: "+key+"::"+"value: "+h.get(key));
		
	}
	*/
	System.out.println("\n <----------------using iterator--------------->");
	Set<Integer> s=h.keySet();
	Iterator<Integer> it=s.iterator();
	while(it.hasNext()) {
		int key=(int)it.next();
		System.out.println("key: "+key+"::"+"value: "+h.get(key));
	}
			
}
}
 