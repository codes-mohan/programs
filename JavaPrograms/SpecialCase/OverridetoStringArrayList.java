package SpecialCase;

import java.util.ArrayList;
import java.util.List;

public class OverridetoStringArrayList {

// if we use user defined object in arraylist
	// to override tostring ....override tostring in userdefined object class

    public static void main(String[] args) 
    {
        //Creating Employee objects
        Employees e1 = new Employees(1,"Employee1");
        Employees e2 = new Employees(2,"Employee2");
        Employees e3 = new Employees(3,"Employee3");
        Employees e4 = new Employees(4,"Employee4");
        
        //Add all Employee objects to empList
        List<Employees> empList = new ArrayList<Employees>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        
        //Print the empList
        System.out.println(empList);
    }
}

class Employees
{
    private int empId;
    private String empName;

    public Employees(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + "]";
    }
}
