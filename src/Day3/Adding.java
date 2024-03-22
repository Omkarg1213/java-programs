package Day3;

public class Adding {
	public static void main(String[] args) {
		int[] arr = new int[100];
		
		//arr[0] = 1;
		
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = i+1;
			System.out.println(arr[i]);
		}
	}

}
