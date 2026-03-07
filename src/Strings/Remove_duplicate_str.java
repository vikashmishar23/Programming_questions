package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Remove_duplicate_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world";
		HashSet<Character> set= new LinkedHashSet<>();
		for(char ch:s.toCharArray()) {
			set.add(ch);
		}
		
		StringBuilder sb= new StringBuilder();
		for(char c:set) {
			sb.append(c);
		}
		System.out.println(sb.toString());

	}

}
