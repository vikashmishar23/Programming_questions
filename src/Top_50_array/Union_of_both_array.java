package Top_50_array;
import java.util.*;
public class Union_of_both_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,4,5,6};
		int [] arr2= {5,6,7,8};
		
		Set<Integer> union= new HashSet<>();
		for(int elm: arr) {
			union.add(elm);
		}
		for(int elm: arr2) {
			union.add(elm);
		}
		
		System.out.println(union);

	}

}
