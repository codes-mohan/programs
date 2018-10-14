package Collections;

import java.util.ArrayList;
import java.util.Iterator;

class EmployeeNotFoundException extends Exception {
	public EmployeeNotFoundException(String msg) {
		super(msg);
	}
}

public class EmployeeClass {
	public EmployeeClass(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}

	private int empid;
	private String empname;

	public int getEmpid() {
		return empid;
	}

	public String getEmpname() {
		return empname;
	}

	public static void main(String[] args) throws EmployeeNotFoundException {
		ArrayList<EmployeeClass> al = new ArrayList<>();

		EmployeeClass e1 = new EmployeeClass(101, "amit");
		EmployeeClass e2 = new EmployeeClass(102, "arun");
		EmployeeClass e3 = new EmployeeClass(103, "arjun");
		EmployeeClass e4 = new EmployeeClass(104, "anil");
		EmployeeClass e5 = new EmployeeClass(105, "akash");

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		// EmployeeClass newemp = new EmployeeClass(105, "akash");
		Iterator<EmployeeClass> it = al.iterator();
		boolean flag = false;

		while (it.hasNext()) {
			EmployeeClass emp = it.next();
			if (emp.getEmpname() == "akash") {
				System.out.println(emp.empname + " " + emp.empid);
				flag = true;
				break;
			}

		}
		if (!flag)
			throw new EmployeeNotFoundException("not found");

	}

}
