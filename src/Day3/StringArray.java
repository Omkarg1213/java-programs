package Day3;

public class StringArray {
	public static void main(String[] args)
	{
		String[] stringArray = new String[3];
		stringArray[0] = "Omkar";
		stringArray[1] = "Akshay";
		stringArray[2] = "Jyothsana";
		
		System.out.println(stringArray[2]);
		
		for(int i = 0; i < stringArray.length; i++)
		{
			System.out.println(stringArray[i]);
		}
	}

}
