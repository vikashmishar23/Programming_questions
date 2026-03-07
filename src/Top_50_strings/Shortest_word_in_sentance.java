package Top_50_strings;

public class Shortest_word_in_sentance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is a powerful programming language";

        String[] words = str.split(" ");

        String sort = words[0];
        for(int i=0; i<words.length; i++) {
        	if(words[i].length()< sort.length()) {
        		sort=words[i];
        	}
        }
    System.out.println(sort);
	}

}
