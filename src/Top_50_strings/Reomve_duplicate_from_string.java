package Top_50_strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class Reomve_duplicate_from_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="madam";
    Set<Character> set= new LinkedHashSet<>();
    for(char elm: s.toCharArray()) {
    	set.add(elm);
    }
    
   
    StringBuilder sb= new StringBuilder();
    for(char i: set) {
    	sb.append(i);
    }
    System.out.println(sb);
    
	}

}
