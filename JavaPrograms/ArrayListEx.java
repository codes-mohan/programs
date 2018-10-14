import java.util.*;

public class ArrayListEx
{
@SuppressWarnings("unchecked")
public static void main(String args[])
	{
		String str1 = new String("kris1");
		String str2 = new String("kris2");
		String str3 = new String("kris3");
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		al.add(str1);
		al.add(str2);
		al.add(str3);
		Object a[]=al.toArray();
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		System.out.println(al.get(i));
		for(int i=0;i<a.length;i++)
		System.out.println(a[i].toString());



	}
}
