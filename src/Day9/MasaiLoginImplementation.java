package Day9;

public class MasaiLoginImplementation implements MasaiLogin{

	@Override
	public String login(String user_name,String Password) {
		// TODO Auto-generated method stub
		// Perform login logic here
        System.out.println("Logged in: " + user_name);
        return Password; // Return user_name or Password based on your requirement
	}

	

}
