package Top_50_array;

import java.util.Arrays;

public class Find_duplicates_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {1,2,3,1,2,4};
      int x=1;
      Arrays.sort(arr);
      for(int i=1; i<arr.length; i++) {
    	  if(arr[i]!=arr[i-1]) {
    		  arr[x++]=arr[i];
    	  }
      }
     // System.out.println(Arrays.toString(arr));
      for(int i=0; i<x; i++) {
    	  System.out.print(arr[i]+" ");
      }
	}

}
