package Striver;
import java.util.*;
public class Leaders_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,7,25,12,23,0,6};
		int n=arr.length;
		List<Integer> list= new ArrayList<>();
	
		
		/*
		for(int i=0; i<n; i++) {
			boolean leader=true;
			for(int j=i+1; j<n; j++) {
				if(arr[j]>arr[i]) {
					leader=false;
					break;
				}
			}
			if(leader==true) {
				list.add(arr[i]);
			}
		}
		System.out.println(list);
		*/
		int max1=Integer.MIN_VALUE;
		for(int i=n-1; i>=0; i--) {
			if(arr[i]> max1) {
				list.add(arr[i]);
			}
			max1=Math.max(max1, arr[i]) ;
		}
		System.out.println(list);

	}

}
