package array;
import java.util.*;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world Iam a Java Developer";
		Map<Character, Long> map= s.chars().boxed().collect(Collectors.
				groupingByConcurrent(i->(char)i.intValue(),Collectors.counting()));
		
		System.out.println(map);
				


	}

}
