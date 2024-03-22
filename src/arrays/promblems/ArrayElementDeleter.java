package arrays.promblems;

public class ArrayElementDeleter {
public static void main(String[] args) {
	int[] arr = {1,2,3,4,5};
	int positionDelete = 3;  // at 3rd index i,e element 4
	
	if(positionDelete < 0 || positionDelete > arr.length)
	{
		System.out.println("Invalid");
	}
	
	for(int i = positionDelete; i < arr.length-1; i++)
	{
		arr[i] = arr[i+1];
	}
	
	int[] newArr = new int[arr.length-1];
	System.arraycopy(arr, 0, newArr, 0, newArr.length);
	
	for(int value : newArr)
	{
		System.out.println(value);
	}
	
}
}
