package SpecialCase;

import java.util.HashMap;

class Students {
	private int id;
	private String name;

	public Students(int id, String name) {

		this.id = id;
		this.name = name;
	}
	// to print valid statement about object though collection
	// override toString()

	@Override
	public String toString() {
		return "ID: " + id + " Name: " + name;
	}

// we have to generate hashCode and equals iff userdefined objects is actong as keys in map
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class MapCustomObjects {
	public static void main(String[] args) {

		/** for wrapper classes **/
		/*
		 * HashMap<Integer, String> map=new HashMap<>(); map.put(1, "one");
		 * map.put(1,"two"); /**automatically overwrites old key
		 * System.out.println(map);
		 */

		/**** for wrapper Objects as key ******************/

		/*
		 * HashMap<Integer,Students> map = new HashMap<>();
		 * 
		 * Students s1=new Students(1, "amit"); Students s2=new Students(2, "arun");
		 * Students s3=new Students(3, "anil"); Students s4=new Students(4, "akash");
		 * 
		 * map.put(1, s1); map.put(2,s2); map.put(3, s3); map.put(1,s4); // overwrites
		 * 
		 * System.out.println(map);
		 */

		/******* for user defined objects as a key ************/
		
		HashMap<Students, Integer>map=new HashMap<>();
		Students s1=new Students(1, "amit"); 
		Students s2=new Students(2, "arun");
		Students s3=new Students(3, "anil"); 
		
		map.put(s1, 1);
		map.put(s2, 2);
		map.put(s3, 1);
		map.put(s1,3);
		for(Students key:map.keySet())
		System.out.println("key is-->"+key+"--->mapped to---->"+map.get(key));
		
	}
}
