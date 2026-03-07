package Top_50_array;

import java.util.Arrays;

public class Move_all_negative_in_one_side {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,1,-1,6,-1,7,-7,8};
		int start=0;
		int end=arr.length-1;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>0) {
				arr[start++]=arr[i];
			}
			else if(arr[i]<0) {
				arr[end--]=arr[i];
			}
			
		}
    System.out.println(Arrays.toString(arr));
	}

}
