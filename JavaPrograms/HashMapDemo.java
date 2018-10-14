import java.util.HashMap;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap<Integer,String> hm=new HashMap<>();
	hm.put(0, "zero");
	hm.put(1, "one");
	hm.put(null, null);
	hm.put(1, "one"); //duplicate ignored
	hm.put(1, "two");  //duplicate key ,,,overwrites the first
	// these will happens only for built-in objects..not for user defined
	System.out.println(hm.size());
}
}
