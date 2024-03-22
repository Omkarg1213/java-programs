package Day5;

public class Bank {

String acc_no= "account number storage";
String acc_holder_name = "account holder name storage";
private String password ;

public String getpassword()
{
	return password;
}

public String setpassword(String password)
{
	return this.password=password;
	
}	
public void toOpenNewAcc()
{
	System.out.println("To open new account you must have Adharcard");
} 

public String toKnowRateOfInterst(String rateOfInterst)
{
	return rateOfInterst;
}

public Bank(String accNo, String accHolderName) {
    this.acc_no = accNo;
    this.acc_holder_name = accHolderName;
}


  public Bank()
  {
	  System.out.println("Welcome to bank"); 
  }
 
}
