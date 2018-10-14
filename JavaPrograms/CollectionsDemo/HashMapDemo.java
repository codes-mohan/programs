package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap <Integer,String>h=new HashMap<Integer,String>();
	
	h.put(1, "one");
	h.put(null,"null");  //this will be ignored
	h.put(null, null);   // this will be printed
	
	System.out.println(h);
	
	
	for(Map.Entry<Integer,String>map:h.entrySet()) {
		System.out.println(map.getKey()+"-->"+map.getValue());
	}
	
	Set s=h.entrySet();
	
	Iterator it=s.iterator();
	
	while(it.hasNext())
	{
		Map.Entry<Integer, String> map= (Entry<Integer, String>) it.next();
		System.out.println(map.getKey()+"--->"+map.getValue());
	}
}
}
