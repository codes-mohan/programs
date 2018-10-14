import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	
	TreeMap <Integer,String> tm=new TreeMap<Integer,String>();
	tm.put(1, "one");
	//tm.put(null, null);--->gives null pointer exception
	tm.put(1, "two");
	tm.put(50, "fifty");
	tm.put(25, "twentyfive");
	
	System.out.println(tm);
	
	
	
	
}
}
