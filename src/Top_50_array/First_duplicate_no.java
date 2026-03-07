package Top_50_array;

import java.util.HashSet;
import java.util.Set;

public class First_duplicate_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,2,4,7,4,9};
		HashSet<Integer> set= new HashSet<>();
		int duplicate=-1;
		for(int elm :arr) {
			if(set.contains(elm)) {
				duplicate=elm;
			    // return;
			}
			else {
				set.add(elm);
			}
		}
		System.out.println(duplicate);

	}

}
