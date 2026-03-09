package sorting_algo;

import java.util.Arrays;

public class Insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {6,1,3,4,2,7,5};
		for(int i=0; i<arr.length; i++) {
			int curr=arr[i];
			int j=i-1;
			while(j>=0 && curr <arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=curr;
		}
		System.out.println(Arrays.toString(arr));
	}

}
