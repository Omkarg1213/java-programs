package Day5;

public class ICICI extends Bank{

	String acc_no= "to store account number for ex.20189090";
	String acc_holder_name = "to store account holder number for ex.Mr.Omkar";
	
	public void toOpenNewAcc()
	{
		System.out.println("To open new account you must have Adharcard, Pancard and Two Passport size photos");
	}
	
	public void display()
	{
		System.out.println(super.acc_no);  //1)super is used to refer immediate parent class instance variable.
		System.out.println(super.acc_holder_name + "\n"); //1)super is used to refer immediate parent class instance variable.
		
		System.out.println(acc_no);
		System.out.println(acc_holder_name);
		
		super.toOpenNewAcc(); //2)super can be used to invoke parent class method
		toOpenNewAcc();
	}
	
	public ICICI(String accNo, String accHolderName) 
	{
		super("20188080", "Akshay");  //super is used to invoke parent class constructor.	
	}
}
