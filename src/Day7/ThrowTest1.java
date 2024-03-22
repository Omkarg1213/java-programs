package Day7;

public class ThrowTest1 {   
    //function to check if person is eligible to vote or not   
 public static void main(String[] args) {
	 try {
	  validate(13);
	 }
	 catch(ArithmeticException e) {
		System.out.println("Exception is hsndled by Omkar G");
	 }
	 System.out.println("Rest of the code");
	 }
    
public static void validate(int age)
{
	if(age < 18)
	{
		throw new ArithmeticException("Not Eligible to vote");
	}
	else
	{
		System.out.println("Eligible to vote");
	}
}
}