import java.util.Comparator;
import java.util.TreeSet;

class Student2{
int roll;
  String name;
  Student2(int r,String n)
  {
      roll = r;
      name = n;
  }
  public String toString()
  {
      return roll+" "+name;
  }
}
class MyComparator implements Comparator<Student2>
{
  public int compare(Student2 s1,Student2 s2)
    {
        if(s1.roll == s2.roll) return 0;
        else if(s1.roll > s2.roll) return 1;
        else return -1;
    }  
}
public class ComparatorDemo
{
    
   public static void main(String[] args) 
   {
       TreeSet< Student2> ts = new TreeSet< Student2>(new MyComparator());
       ts.add(new Student2(45, "Rahul"));
       ts.add(new Student2(11, "Adam"));
       ts.add(new Student2(19, "Alex"));
       System.out.println(ts);
     
   }
    
}
