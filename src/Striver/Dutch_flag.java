package Striver;

import java.util.Arrays;

public class Dutch_flag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-1,0,3,-2,-4,0,0,5,7,8,0};
		int start=0;
		int mid=0;
		int end=arr.length-1;
		
		while(mid<=end) {
			
			if(arr[mid]< 0) {
				int temp=arr[start];
				arr[start]= arr[mid];
				arr[mid]= temp;
				
				start++;
				mid++;
			}
			
			else if(arr[mid]==0) {
				mid++;
			}
			else {
				int temp= arr[mid];
				arr[mid]=arr[end];
				arr[end]= temp;
				end--;
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
