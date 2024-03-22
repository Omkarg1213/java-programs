package controlstatements.programs;

public class Exception1 {
	public static void main(String[] args) {
		String name = "Omkar";
		
	try {	
		name.charAt(7);
	}catch(Exception e)
	{
		System.out.println("Exception Handled");
	}
	}
}
