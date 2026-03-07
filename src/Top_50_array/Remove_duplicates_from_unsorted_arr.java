package Top_50_array;

import java.util.Arrays;

public class Remove_duplicates_from_unsorted_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,1,3,2,1,4};
		int x=1;
		Arrays.sort(arr);
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=arr[i-1]) {
				arr[x++]=arr[i];
			}
		}
		for(int i=0; i<x; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
