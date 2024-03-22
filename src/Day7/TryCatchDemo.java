package Day7;

public class TryCatchDemo {
static String s = null;
static String s1 = "";
static int i =100;
static int j =0;

public static void main(String[] args) {
	//Arithmetic exception
	try {
      System.out.println(i/j);
	    }
	catch(ArithmeticException e)
	{
		System.out.println(i/(j+1)); //example to resolve the exception in a catch block.
	}
	
	System.out.println("Airthmatic Exception is handled");
    
    //NumberFormatException
	try
	{
     int num =Integer.parseInt(s);
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	
	System.out.println("NumberFormat Exception is handled");
	
    //NullPointerExxception
	try {
		
	//NullPointerExxception
   // int l = s.length(); ////may throw exception 
	
    //ArrayOutOfBoundException
	
	  int[] a = {1,2,3,4};
	  //int c = a[5];  // if exception occurs, the remaining statement will not execute  
	 
	
	//StringOutOfBoundExceptioon
	// System.out.println(s1.charAt(0));
	  
	  Object obj = "Hello";
      Integer num = (Integer) obj; // Throws ClassCastException and it will be caught by general exception
	  
	}
	
	//Handling Exception
	
	 catch(NullPointerException e)
	{
		System.out.println("NullPointer Exception"); //displaying the     custom message
    }
		 
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("ArrayOutOf Bound Exception"); //displaying the custom message  
	}
	
	catch(StringIndexOutOfBoundsException e)
	{
		System.out.println("StringIndexOutOf BoundsException");
	}
	catch(Exception e)
	{
		System.out.println("Parent Exception");
	}
	
	
	//All catch blocks must be ordered from most specific to most general, 
	//i.e. catch for StringIndexOutOfBoundsException must come before catch for ArrayIndexOutOfBoundsException and if you're using exception.
	
	
	/*
	 * catch(StringIndexOutOfBoundsException e) {
	 * System.out.println("StringIndexOutOf BoundsException"); //displaying the
	 * custom message }
	 */
	System.out.println("Rest of the code");
}

}
