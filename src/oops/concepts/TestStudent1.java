package oops.concepts;

public class TestStudent1 {
 public static void main(String[] args) {
	 int marks;
	Student s1 = new Student();
// Initializing object through reference variable
	/*
	 * s1.id = 131; s1.name = "Omkar G";
	 * 
	 * System.out.println(s1.id); System.out.println(s1.name);
	 */
	
// Initializing object through method
	s1.insertRecord(131, "Omkar G");
	////we can change the schoolName of all objects by the single line of code  
	//Student.schoolName = "GJCB";
    s1.displayInformation();  
}
}
