package Top_50_array;

import java.util.Arrays;

public class Sort_arr_negative_zero_positive_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-1,0,-1,-1,-1,0,3,3,3,0};
		int low=0;
		int mid=0;
		int high=arr.length-1;
		
		while(mid<=high) {
			if(arr[mid]>0) {
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}
			else if(arr[mid]==0) {
			 mid++;
			}
			else {
				int temp=arr[mid];
				arr[mid]=arr[high];
				arr[high]=temp;
				
				high--;
			}
		}
   System.out.println(Arrays.toString(arr));
	}

}
