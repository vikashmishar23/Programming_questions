package Striver;
import java.util.*;
public class leaders_elm_left_side {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,7,25,12,23,0,6};
		int n=arr.length;
		List<Integer> list= new ArrayList<>();
		for(int i=0; i<n; i++) {
			boolean leader=true;
			
			for(int j=0; j<i; j++) {
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

	}

}
