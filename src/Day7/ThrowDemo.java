package Day7;

public class ThrowDemo {
 public static void main(String[] args) {
	 int age = 9;
	 try {
	 if (age < 0) 
	     throw new IllegalArgumentException("Age must be non-negative");
	 else
		 System.out.println("Sad...You're exist in th earth");
	 }
	 catch(Exception e) {
		 System.out.println("a");
	 }
	 
	 finally {
		 System.out.println("tata...bye...bye...khatam!!!");
	 }
}
}
