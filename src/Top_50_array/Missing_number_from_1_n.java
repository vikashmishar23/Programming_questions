package Top_50_array;
import java.util.*;
public class Missing_number_from_1_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,9,2,3,7,5,6};
		int max=0;
		Set<Integer> set= new HashSet<>();
		for(int i:arr) {
			set.add(i);
			 if(i>max) {
				 max=i;
			 }
			 
		}
		for(int i=1; i<max; i++) {
			 if(!set.contains(i)) {
				 System.out.println("missing !"+ i);
			 }
		 }
		

	}

}
