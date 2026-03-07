package Top_50_array;
import java.util.*;
public class Intersection_of_two_arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5};
		int [] arr2= {1,2,6,7,5};
		Set<Integer> set= new HashSet<>();
		Set<Integer> res= new HashSet<>();
		
		for(int elm : arr) {
			set.add(elm);
		}
		for(int elm: arr2) {
			if(set.contains(elm)) {
				res.add(elm);
			}
		}
		System.out.println(res);

	}

}
