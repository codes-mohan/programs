package Collections;

import java.util.HashSet;
import java.util.Set;

public class FindindDuplicates {
public static void main(String[] args) {
	

	String name[]= {"sang","shin","boston","shin"};
	Set<String>s=new HashSet<String>();
	
	for(int i=0;i<name.length;i++)
	{
		if(!s.add(name[i]))
			System.out.println("duplcates--->"+name[i]);
		else
			System.out.println("distinct-->"+name[i]);
	}
	
	System.out.println(s.size()+"distinct elements detected--->"+s);


}
}	