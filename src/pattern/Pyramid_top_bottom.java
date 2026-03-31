package pattern;

import java.util.Arrays;

public class Pyramid_top_bottom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,0,-1,-3,9,0,3,4,7};
		int start=0;
		int mid=0; 
		int end=arr.length-1;
		
		while(mid<=end) {
			if(arr[mid]==0) {
				int temp=arr[start];
				arr[start]=arr[mid];
				arr[mid]=temp;
				start++;
				mid++;
				
			}else if(arr[mid]==1) {
				mid++;
			}
			else {
				int temp=arr[mid];
				arr[mid]=arr[end];
				arr[end]= temp;
				end--;
			}
		}
		System.out.println(Arrays.toString(arr));	

	}

}
