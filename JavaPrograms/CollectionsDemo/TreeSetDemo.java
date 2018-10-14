package Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

// must implement Comparable for treeset
class Employee implements Comparable{
	int empid;
	int empSalary;
	String empName;

	public Employee(int empid, int empSalary, String empName) {

		this.empid = empid;
		this.empSalary = empSalary;
		this.empName = empName;
	}

	@Override
	public int compareTo(Object arg0) {
		int eid1=this.empid;
		int eid2=((Employee)arg0).empid;
		if(eid1<eid2)
			return -1;
		else if(eid1>eid2)
			return 1;
		else
			return 0;
	}
}

public class TreeSetDemo {
	public static void main(String[] args) {
		// compareTo method in comparable will automatically called by TreeMap
		
		// but compare method in Comparator won't called by treeset
		 // we have to pass reference of class which implements Comparator
		TreeSet<Employee>employees=new TreeSet<>(new Mycomparator());
		
		Employee e1=new Employee(101, 50000, "john");
		Employee e2=new Employee(102, 5000, "mark");
		Employee e3=new Employee(103, 80000, "anil");
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		
	Iterator<Employee>it=employees.iterator();
	
	while(it.hasNext())
	{
		Employee e=it.next();
		
		System.out.println(e.empid+" "+e.empName+" "+e.empSalary);
	}
		
		
	}
}



class Mycomparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		String emp1=((Employee)arg0).empName;
		String emp2=((Employee)arg1).empName;
		return emp1.compareTo(emp2);
	}
	
}