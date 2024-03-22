package Day4;

public class UserDeatils2 {

	String name;
	int age;
	char gender;
	String contact_num;
	
	UserDeatils2(String nam,int ag,char gende,String contact_n)
	{
		name = nam;
		age = ag;
		gender = gende;
		contact_num = contact_n;
	}
	
	public static void main(String[] args) {
		UserDeatils2 ud = new UserDeatils2("Omkar G", 21, 'M', "9731656168");
		
		System.out.println(ud.name+"\n"+ud.age+"\n"+ud.gender+"\n"+ud.contact_num);
	}
}
