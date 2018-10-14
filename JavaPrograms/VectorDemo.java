import java.util.*;
public class VectorDemo
{
  public static void main(String[] args) 
   {
      Vector<Integer> ve = new Vector<>();
       ve.add(10);
       ve.add(20);
       ve.add(30);
       ve.add(40);
       ve.add(50);
       ve.add(60);
       
       Enumeration<Integer> en = ve.elements();
       
       while(en.hasMoreElements())
       {
           System.out.println(en.nextElement());
       }
   }
    
}