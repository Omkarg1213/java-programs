package oops.concepts;

public class Student {
	int id;         //fields or data members or instance variables
	String name;
	static String schoolName = "GJCP";
	
	void insertRecord(int id,String name)
	{
		this.id = id;
		this.name = name;
	}

    void displayInformation() {
		// TODO Auto-generated method stub
		System.out.println(id +" "+name+" "+schoolName);
	}
}
