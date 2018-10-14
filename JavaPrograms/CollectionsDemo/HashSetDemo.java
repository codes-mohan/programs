package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
public static void main(String[] args) {
	Set<Integer> s=new HashSet();
	// wrong ---> Set<Integer> s1=new HashSet(Integer);
	Set s2=new HashSet<Integer>();
	
	HashSet<Integer> s3=new HashSet();
	
	// wrong---->HashSet s3=new HashSet<Integer>();
	
	HashSet<Integer> s4=new HashSet<Integer>();
	
	int numbers[]= {10,20,30,40,50,40,50,50,8,06,90};
	
	for (int i = 0; i < numbers.length; i++) {
		s.add(numbers[i]);
	}
	
	System.out.println(s);
	
	for (int i : numbers) {
		System.out.print(i+" ");
	}
	System.out.println();
	Iterator<Integer>it=s.iterator();
	
	while (it.hasNext()) {
		Integer integer = (Integer) it.next();
		System.out.print(integer+" ");
		
	}
}
}
