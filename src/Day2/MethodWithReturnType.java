package Day2;

public class MethodWithReturnType 
{
	public static void main(String args[])
	{
		String result = concat("Omkar","G");
		System.out.println(result);
	}
	
	public static String concat(String name1,String name2)
	{
		String name3 = name1 + " " +name2;
		return name3;
	}
}


