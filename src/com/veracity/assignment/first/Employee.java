package com.veracity.assignment.first;

public class Employee {

	private int id;
	private String name;
	private int sal;

	public Employee(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
     
	public Employee() {
		this.id = 101;
		this.name = "SAM";
		this.sal = 1000;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Salary: " +sal;
    }
}
