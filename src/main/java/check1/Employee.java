package check1;

import java.util.ArrayList;

public class Employee {
	public	String id;
	public String name;
	public String department;
	public  double salary;
	static double tot=0;
	

	static ArrayList<Employee> ar=new ArrayList<>();	
	
	
	public Employee(String id,String name,String department,double salary) {
		this.id=id;
		this.salary=salary;
		this.department=department;
		this.salary=salary;
		
		ar.add(this);
		
	}

	public static void printDetails() {
		for(Employee e:ar) {
			tot+=e.salary;
		}
		System.out.println(tot);
	}

	
	
}
