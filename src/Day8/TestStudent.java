package Day8;

import java.util.*;

public class TestStudent {
	   public  ArrayList<Student> getStudentList() {
	        Student s1 = new Student("omkar", 1, 99);
	        Student s2 = new Student("kiran", 2, 90);
	        Student s3 = new Student("Priya", 3, 95);
	        Student s4 = new Student("Kumari", 4, 99);

	        ArrayList<Student> list = new ArrayList<>();
	        list.add(s1);
	        list.add(s2);
	        list.add(s3);
	        list.add(s4);

	        return list;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("omkar",1,99);
		Student s2 = new Student("kiran",2,90);
		Student s3 = new Student("Priya",3,95);
		Student s4 = new Student("Kumari",4,99);

      ArrayList<Student> list = new ArrayList<Student>();
      list.add(s1);
      list.add(s2);
      list.add(s3);
      list.add(s4);
      
      Iterator itr = list.iterator();
      
      while(itr.hasNext())
      {
    	  Student st=(Student)itr.next(); 
    	  System.out.println("Name: "+st.name+ "\n" + "Roll no: "+st.roll_no + "\n"+"Marks: "+ st.marks);
      }
	}

}
