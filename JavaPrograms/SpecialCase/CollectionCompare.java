package SpecialCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class CollectionCompare {
public static void main(String[] args) {
	List<String>li=new ArrayList<>();
	List<String>ve=new Vector<>();
	
	li.add("abd");
	ve.add("abc");
	if(li==ve)
		System.out.println("a");
	else if(li.equals(ve))
		System.out.println("b");
	else
		System.out.println("c");
}
}
