package Top_50_array;
import java.util.*;
public class Find_subarray_with_given_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {2,3,4,1,6,3,4,5,8,9,10};
      int k=6;
      int sum=0;
      int i=0,j=0;
      List<List<Integer>> result = new ArrayList<>();
      while(j<arr.length) {
    	  sum=sum+arr[j];
    	  
    	  if(j-i+1<k) {
    		  j++;
    	  }
    	  
    	  else if(sum> k && i<=j) {
    		  sum=sum-arr[i];
    		  i++;
    	  }
    	  else if(sum==k) {
    		  
    		  List<Integer> temp= new ArrayList<>();
    		  for(int x=i; x<=j; x++) {
    			 temp.add(arr[x]); 
    		  }
    		  result.add(temp);
    		  sum=sum-arr[i];
    		  i++;
    		  j++;
    		  
    	  }
    	  j++;
      }
      System.out.println(result);
	}

}
