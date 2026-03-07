package array;

import java.util.HashSet;
import java.util.Set;

public class Firsst_duplicate_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,3,5,3,2,2};
		int duplicate=-1;
		Set<Integer> set= new HashSet<>();
		for(int elm: arr) {
			if(set.contains(elm)) {
				duplicate=elm;
				break; // if we dont implement break then this code gives us last duplicate element
				
			}else {
				set.add(elm);
			}
		}
		System.out.println(duplicate);

	}

}
