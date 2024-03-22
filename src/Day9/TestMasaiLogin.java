package Day9;

public class TestMasaiLogin{

	public static void main(String[] args) {
        MasaiLogin m = (user_name, Password) -> {
            MasaiLoginImplementation loginImpl = new MasaiLoginImplementation();
            String loggedInUser = loginImpl.login(user_name, Password);
            System.out.println("User_name: " + loggedInUser);
            return loggedInUser;
        };
        
        // Example usage
        String loggedInUser = m.login("Omkar", "omya2002");
        System.out.println("Logged in user: " + loggedInUser);
    }
}