package oops.concepts;

public class Employee {
int id;
String name;
float salary;

void insert(int id,String name,float salary)
{
	this.id = id;
	this.name = name;
	this.salary = salary;
	System.out.println(this.id+"\n"+this.name+"\n"+this.salary);
}

void displayInfo()
{
System.out.println(this.id+"\n"+this.name+"\n"+this.salary);	
}
}
