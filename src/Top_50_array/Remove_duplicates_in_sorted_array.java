package Top_50_array;

import java.util.Arrays;

public class Remove_duplicates_in_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,2,3,4,4,5};

		int x = 0;

		for (int i = 0; i < arr.length; i++) {
		    if (i == 0 || arr[i] != arr[i - 1]) {
		        arr[x++] = arr[i];
		        
		    }
		}

		// print only unique portion
		for (int i = 0; i < x; i++) {
		    System.out.print(arr[i] + " ");
		}
	}

}
