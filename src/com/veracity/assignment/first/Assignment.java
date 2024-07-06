package com.veracity.assignment.first;

import java.util.Scanner;

public class Assignment {

    private static int total = 10;
    int x = 10;
    
    static int a = 0;
    
    public static void add() {  
		int a = 10 + 30;
	}
    
    public static void show(Employee employee){
	System.out.println("Q5. " +employee);
    }
    
    public void show_nonStatic(Employee employee){
    	System.out.println("Q6. " +employee);
        }

    public static void show(Employee emp1,Employee emp2){
	System.out.println("Q7. First Employee:- " +emp1
			+"\n Second Employee:- " +emp2 );
	}		

    public static void show_bonus(Employee emp){
	System.out.println("Q9. " +emp);
	emp.setSal(emp.getSal() + 100);
	System.out.println("Salary after bonus: " +emp);
    }

    public void show_bonus_nonStatic(Employee emp) {
    	System.out.println("Q9. " +emp);
    	emp.setSal(emp.getSal() + 100);
    	System.out.println("Salary after bonus: " +emp);
		}
    
    public static void show_ways(Employee employee){
	System.out.println("Q11. " +employee);
    }	
    
    public static void show(){
    	int x = 100;
    	Assignment a = new Assignment();
    	System.out.println("Q13. Non-static variable: x = " +a.x);
    	System.out.println(" Local variable: x = " +x);
    }	
    
    public static void m1(Employee e){
    	System.out.println("Q24. "+e);
	}
    
    public static void m1(Object o){
    	System.out.println("Q25. "+o);
	}

    public static void m1(int i){
		System.out.println("Q26. ID = "+i);
	}

    public static int m1_int(int i){
		System.out.println("Q27. m1 called");
		return i*i;
	}

    public static float m1_float(int i){
		System.out.println("Q29. m1 called");
		return i*i;
	}
    
    public static Employee m1(){
    	Employee employ = new Employee(103,"Mark",4000);
		return employ;
	}

    public static Object m1_obj(){
    	Object employ_obj = new Employee(104,"Suzie",8000);
    	return employ_obj;
	}
    
    public static int m2(int i){
		return i*i;
	}

    public static void show_records(Employee employee_records){
    	System.out.println("Q33. "+employee_records);
	}
	public static void process_records(Employee employee_records){
		employee_records.setId(108);
		employee_records.setName("Terry");
		employee_records.setSal(7000);
		}


	public static void main(String[] args) {
		
		
		//Question 1
		Product product = new Product(1,"Mobile",26.0f);
		System.out.println("Q1. "+product);
	
	   //Question 2
	    Employee em = new Employee();
		System.out.println("Q2. "+em);
		
		//Question 3
		Employee emp = new Employee();
		emp.setId(101);
		emp.setName("sam");
		emp.setSal(1000);
		System.out.println("Q3. "+emp);
		
		//Question 4
		Employee employee = new Employee(102,"Tina",2000);
		System.out.println("Q4. " +employee);
		
		//Question 5
		Assignment.show(emp); 
		
		//Question 6
		Assignment asgn = new Assignment();
		asgn.show_nonStatic(emp);
		
		//Question 7
		Assignment.show(emp,employee);
		
		//Question 9
		Assignment.show_bonus(emp);
		
		//Question 10
		Assignment asgnt = new Assignment();
		asgnt.show_bonus_nonStatic(emp);
		
		//Question 11 
		Assignment assgnmnt = new Assignment();
		assgnmnt.show_ways(emp);
		show_ways(emp);
		Assignment.show_ways(emp);
		
		//Question 12
		System.out.println("Total: "+total);
		System.out.println("Total: "+Assignment.total);
		System.out.println("Total: "+assgnmnt.total);
		
		//Question 13
		Assignment.show();
		
		//Question 14
		HelloWorld hw = new HelloWorld();
		hw.show();
		
		//Question 15
		HelloWorld.show_static();
		
		//Question 16
		HelloWorld.m1_static();
		
		//Question 17
		hw.m1();
		
		//Question 18
		HelloWorld.m1(8);
		
		//Question 19
		HelloWorld.m1(8.5f);
		
		//Question 21
		HelloWorld.m1(emp);
		
		//Question 22
		HelloWorld.m1("s");
		
		//Question 23
		Object obj = new Object();
		HelloWorld.m1(obj);
		
		//Question 24
		Assignment.m1(employee);
		
		//Question 25
		Object employee_obj = new Employee(101,"Sam",1000);
		Assignment.m1(employee_obj);

		//Question 26
		int i = employee.getId();
	    Assignment.m1(i);
	    
	    //Question 27
	    Assignment.m1_int(5);
	    
	    //Question 28
	    int total_int =  100 + Assignment.m1_int(5);
	    System.out.println("Q28. Total = "+total_int);
	    
	    //Question 29
	    int total_float =  (int) (100 + Assignment.m1_float(5));
	    System.out.println("Total = "+total_float);
	    
        //Question 30
	    System.out.println("Q30. "+Assignment.m1());
	    
	    //Question 31
	    System.out.println("Q31. "+Assignment.m1_obj());
	    
	    //Question 32
	    Assignment.m2(6);
	    int response = Assignment.m2(8);
	    System.out.println("Q32. Response = "+response);
	    System.out.println("Response = "+Assignment.m2(6));
	    
	    int expression = (4+Assignment.m2(6));
	    System.out.println("Expression Response = "+expression);
	    
	    //Question 33
	    Employee employee_records = new Employee();
	    Assignment.process_records(employee_records);
	    Assignment.show_records(employee_records);
	    
	  //35
	    Assignment.add();
	    System.out.println("Q35. Total: "+a);
	    
	    //Question 34
	    Employee employee_input = new Employee();
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Name");
	    employee_input.setName(myObj.nextLine());
	    System.out.println("Enter ID");
	    employee_input.setId(myObj.nextInt());
	    System.out.println("Enter Salary");
	    employee_input.setSal(myObj.nextInt());
	    
	    Assignment.show(employee_input);
	        
}

}
