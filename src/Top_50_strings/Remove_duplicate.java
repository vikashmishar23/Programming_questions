package Top_50_strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world";
		Set<Character> set= new LinkedHashSet<>();
		for(char ch: s.toCharArray()) {
			set.add(ch);
		}
		
		
		
		StringBuilder sb= new StringBuilder();
		for(char elm: set) {
			sb.append(elm);
		}
		
		System.out.println(sb.toString());

	}

}
