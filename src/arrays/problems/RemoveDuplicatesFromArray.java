package arrays.problems;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 3, 6, 5, 8, 7, 5, 2, 8, 9, 3};
        int j = 0;

        // Sort the array to bring duplicate elements together
        Arrays.sort(arr);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Remove duplicates in the sorted array
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        // Add the last element to the new array
        arr[j++] = arr[arr.length - 1];

        // Print the array without duplicates
        System.out.println("Array without duplicates:");
        for (int k = 0; k < j; k++) {
            System.out.println(arr[k]);
        }

        // Call method to remove duplicates using HashMap
        RemoveDuplicatesFromArrayUsingHashMap(arr);
    }

    // Method to remove duplicates using HashMap
    private static void RemoveDuplicatesFromArrayUsingHashMap(int[] arr) {
        // Create a HashMap to store unique elements
        HashMap<Integer, Boolean> map = new HashMap<>();

        // Add each element of the array to the HashMap as a key
        // Duplicate keys will automatically be removed
        for (int num : arr) {
            map.put(num, true);
        }

        // Create a new array to store unique elements
        int[] newArr = new int[map.size()];
        int index = 0;

        // Copy keys (unique elements) from the HashMap to the new array
        for (int key : map.keySet()) {
            newArr[index++] = key;
        }

        // Print the array without duplicates
        System.out.println("Array without duplicates (using HashMap): " + Arrays.toString(newArr));
    }
}
