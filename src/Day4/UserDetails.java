package Day4;

public class UserDetails {

	String name;
	int age;
	char gender;
	String contact_num;
	
	UserDetails(String name, int age, char gender, String contact_num)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contact_num = contact_num;
	}
	
	public static void main(String[] args) {
		UserDetails ud = new UserDetails("Omkar G", 21, 'M', "9731656168");
		
		System.out.println(ud.name+"\n"+ud.age+"\n"+ud.gender+"\n"+ud.contact_num);
	}
	
}
