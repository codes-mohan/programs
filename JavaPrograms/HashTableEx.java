
import java.util.*;

public class HashTableEx
{
	public static void main(String args[])
	{

		Hashtable ht = new Hashtable();
		ht.put("kris","ananth");
		ht.put("ravi","rama");
		ht.put("anand","kumar");

		Enumeration e=ht.keys();
		while(e.hasMoreElements())
		{
			String key =(String)e.nextElement();
			System.out.println(key+" mapped with value "+ht.get(key));
		}


	}
}