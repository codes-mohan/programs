import java.util.*;

public class HashSetSEx
{
	public static void main(String args[])
	{

		HashSet<String> hs = new HashSet<String>();
		hs.add("kris");
		hs.add("kris1");
		hs.add("kris2");
		hs.add("kris3");
		hs.add("kris2");
		hs.add("kris3");
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}