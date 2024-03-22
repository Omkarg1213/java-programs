package Day2;

public class MethodDemo 
{
	public static void main(String args[])
	{
		add(20,10);
		sub(20,40);
		mul(30,40);
		div(12,30);
	}
	
    public static void add(int a,int b)
	{
		int add = a + b;
		System.out.println(add);
	}
	
    public static void sub(int a,int b)
	{
		int sub = a - b;
		System.out.println(sub);
	}
	
	public static void mul(int a,int b)
	{
		int mul = a * b;
		System.out.println(mul);
	}
	
	public static void div(int a,int b)
	{
		int div = a / b;
		System.out.println(div);
	}

}
