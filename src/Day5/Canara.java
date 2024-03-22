package Day5;

public class Canara extends Bank{

	private String user_pin;
	private String Adhar_card_no;
	
	public String getuser_pin()
	{
		return user_pin;
	}
	
	public void setuser_pin(String user_pin)
	{
		this.user_pin = user_pin;
	}
	
	public String Adhar_card_no()
	{
		return user_pin;
	}
	
	public void setAdhar_card_no(String user_pin)
	{
		this.user_pin = user_pin;
	}
	
	Canara(String accNo, String accHolderName) {
		super(accNo, accHolderName);
		// TODO Auto-generated constructor stub
	}

}
