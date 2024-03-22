package arrays.promblems;


public class FindCommonElementsInSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,6,8,10,12,14,16};
        int[] arr2 = {2,3,16,18,20,22,24};
        int[] arr3 = {2,3,16};
        
        int x = 0, y = 0, z = 0;
        
        while( x < arr1.length && y < arr2.length && z < arr3.length) {
        	 if( arr1[x] == arr2[y] && arr2[y] == arr3[z])
        	 {
        	  System.out.println(arr1[x]);
        	  x++;
        	  y++;
        	  z++;
        	 } else if( arr1[x] < arr2[y])
        	 {
        		 x++;
        	 } else if(arr2[y] < arr3[z]) {
        		 y++;
        	 } else {
        		 z++;
        	 }	 
        }
      
        }
    }



