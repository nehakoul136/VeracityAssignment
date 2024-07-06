package com.veracity.assignment.first;

public class HelloWorld {
	
	
	public void show(){
		System.out.println("Q14. Hello world");
	}
	
	public static void show_static(){
		System.out.println("Q15. Hello world");
	}
    
	public static void m1_static(){
		System.out.println("Q16. a");
	}

	public  void m1(){	
		System.out.println("Q17. m1 method");
	}
	
	public static void m1(int a){
		System.out.println("Q18. a = "+a);
	}
    
	public static void m1(float a){
		System.out.println("Q19. a = "+a);
	}

	public static void m1(Employee e){
		System.out.println("Q21. m1 method");
	}

	public static void m1(String s){
		System.out.println("Q22. "+s);
	}

	public static void m1(Object o){
		System.out.println("Q23. m1 method");
	}

}
