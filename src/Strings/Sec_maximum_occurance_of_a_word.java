package Strings;

import java.util.HashMap;
import java.util.Map;

public class Sec_maximum_occurance_of_a_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world hello hi there may hello be something be";
		String [] str= s.split(" ");
		int first=0;
		String firstword=null;
		
		int second=0;
		String secword=null;
		
	HashMap<String, Integer> map= new HashMap<>();
	for(String c: str) {
		map.put(c, map.getOrDefault(c,0)+1);
	}
	
	for(Map.Entry<String, Integer> entry:map.entrySet()) {
		String word=entry.getKey();
		int count= entry.getValue();
		
		if(count>first) {
			second=first;
			secword=firstword;
			
			first=count;
			firstword=word;
		
		}
		else if(count> second && count!=first){
			second=count;
			secword=word;
		}
	}
		
System.out.println(secword);
System.out.println(firstword);
	}

}
