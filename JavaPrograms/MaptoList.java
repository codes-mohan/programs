import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaptoList {
public static void main(String[] args) {
	Map<Integer,String> m=new HashMap<Integer,String>();
	m.put(0, "zero");
	m.put(1, "one");
	m.put(2, "two");
	m.put(3, "three");
	List<Integer> keys=new ArrayList<Integer>(m.keySet());
	System.out.println("<-------------keys are------------->");
	for(int value:keys)
	{
		System.out.print(value+"  ");
	}
	System.out.println("\n<----------values are------------>");
	List<String>value=new ArrayList(m.values());
	for(String values:value)
	{
		System.out.print(values+"  ");
		
	}
	
}
}
