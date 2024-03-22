package arrays.promblems;

public class ArraySegregator {
	public static void main(String[] args) {
	    int[] arr = {0, 1, 0, 1, 0, 1, 0, 1, 0}; // Original array containing 0s and 1s
	    int j = 0; // Index to keep track of the next position to place a 0
	    
	    // Iterate through the original array
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == 0) { // If the current element is 0
	            arr[j++] = arr[i]; // Place 0 at the position indicated by 'j' and then increment 'j'
	        }
	    }
	    
	    // At this point, all the 0s have been moved to the beginning of the array, and 'j' represents the count of 0s
	    
	    // Now, fill the remaining positions in the array with 1s
	    while (j < arr.length) {
	        arr[j++] = 1; // Fill the array with 1s starting from index 'j' until the end of the array
	    }
	    
	    // Print the modified array
	    for (int value : arr) {
	        System.out.print(value + " "); // Print each element separated by a space
	    }
	}
}
