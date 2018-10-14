package CaveOfProgramming;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
 
class Persons implements Comparable<Persons> {
    private String name;
     
    public Persons(String name) {
        this.name = name;
    }
     
    public String toString() {
        return name;
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Persons other = (Persons) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
 
    @Override
    public int compareTo(Persons persons) {
        int len1 = name.length();
        int len2 = persons.name.length();
         
        if(len1 > len2) {
            return 1;
        }
        else if(len1 < len2) {
            return -1;
        }
        else {
            return name.compareTo(persons.name);
        }
    }
}
 
public class NaturalOrdering {
 
    public static void main(String[] args) {
        List<Persons> list = new ArrayList<Persons>();
        SortedSet<Persons> set = new TreeSet<Persons>();
         
        addElements(list);
        addElements(set);
         
        Collections.sort(list);
         
        showElements(list);
        System.out.println();
        showElements(set);
    }
     
    private static void addElements(Collection<Persons> col) {
        col.add(new Persons("Joe"));
        col.add(new Persons("Sue"));
        col.add(new Persons("Juliet"));
        col.add(new Persons("Clare"));
        col.add(new Persons("Mike"));
    }
     
    private static void showElements(Collection<Persons> col) {
        for(Persons element: col) {
            System.out.println(element);
        }
    }
 
}
