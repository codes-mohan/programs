package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();

		hm.put("one", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		hm.put("four", 4);

		System.out.println(hm);

		/******************* one way of printing ************************/

		Set s = hm.keySet();
		Iterator it = s.iterator();

		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println("key " + key + " is mapped to " + hm.get(key));
		}

		/******************** another way ***************************************/

		for (String key : hm.keySet()) {
			System.out.println("key " + key + " mapped to " + hm.get(key));
		}

		/*************** another way *****************************************/

		for (Map.Entry map : hm.entrySet()) {
			System.out.println(map.getKey() + " : " + map.getValue());
		}
	}
}
