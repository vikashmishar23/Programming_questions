package Top_50_strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Count_frequency_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		Map<Character,Integer> map= new HashMap<>();
		
		for(char ch: s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		System.out.println(map);
		
		
		
		// using stream api
		Map<Character, Long> map1= s.chars().boxed().collect(Collectors.
				groupingByConcurrent(i->(char)i.intValue(),Collectors.counting()));
		
		System.out.println(map1);
		

	}

	
}
