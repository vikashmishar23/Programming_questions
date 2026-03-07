package Top_50_array;

import java.util.HashMap;
import java.util.Map;

public class First_non_repeating_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,2,3,5,6};
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			map.put(i, arr[i]);
		}
		System.out.println(map);
		
		 

	}

}
