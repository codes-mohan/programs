import java.util.*;

public class VectorDemo
{
	public static void main(String args[])
		{
			Vector <String>vec  = new Vector<String>(5,10);
			
			//5 is initial capacity
			// 10 is incremens capacity
			System.out.println("initial capacity: "+vec.capacity());
			vec.add("string1");
			vec.add("string2");
			vec.add("string3");
			vec.add("string4");
			vec.add("string5");
			vec.add("string6");

			for(int i =0;i<vec.size();i++)
			System.out.println(vec.elementAt(i));

			vec.remove(4);

			for(int i =0;i<vec.size();i++)
			System.out.println(vec.elementAt(i));




		}
}