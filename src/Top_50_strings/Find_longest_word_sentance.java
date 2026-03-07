package Top_50_strings;

public class Find_longest_word_sentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is a powerful programming language";

        String[] words = str.split(" ");

        String longest = words[0];
        
        for(int i=0; i<words.length; i++) {
        	if( words[i].length()> longest.length()) {
        		longest=words[i];
        	}
        }
        System.out.println(longest);

	}

}
