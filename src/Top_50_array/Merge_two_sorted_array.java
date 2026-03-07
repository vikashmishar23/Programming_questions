package Top_50_array;

import java.util.Arrays;

public class Merge_two_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3};
		int [] arr2= {4,5,6};
		
		int [] res= new int [arr.length+arr2.length];
		
		for(int i=0; i<arr.length; i++) {
			res[i]=arr[i];
		}
		for(int i=0; i<arr2.length; i++) {
			res[arr.length+ i]=arr2[i];
		}
		
		System.out.println(Arrays.toString(res));

	}

}
