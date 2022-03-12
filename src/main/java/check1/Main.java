package check1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String args[]) {
		
	   double tot=0;
	   ArrayList<Employee> ar=new ArrayList<>();
	   Scanner scan=new Scanner(System.in);
	    
	  
	   for(int i=0;i<2;i++) {
		
        
         System.out.println("id:");
         String id=scan.next();
        
         System.out.println("name:");
         String name= scan.next();
         
         System.out.println("salary:");
         double salary=scan.nextDouble();
         
         System.out.println("dept:");
         String dept= scan.next();
         
        
         Employee e= new Employee(id,name,dept,salary);
         e.printDetails();
         
	 
	 
	 }  
	  
		
		
	}
}
