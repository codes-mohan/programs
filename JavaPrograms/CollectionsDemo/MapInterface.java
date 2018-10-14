package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {

 
 public static void main(String args[]){  
  Map<Integer,String> map=new HashMap<Integer,String>();  
  map.put(100,"Amit");  
  map.put(101,"Vijay");  
  map.put(102,"Rahul");  
  //Traversing Map  
  Set set=map.entrySet();//Converting to Set so that we can traverse  
  Iterator itr=set.iterator();  
  while(itr.hasNext()){  
      //Converting to Map.Entry so that we can get key and value separately  
      Map.Entry entry=(Map.Entry)itr.next();  
   
    System.out.println(entry.getKey()+" "+entry.getValue());  
  }
    // 2nd  type
    for(Map.Entry m:map.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue()); 
   
   
  }  
 }
}