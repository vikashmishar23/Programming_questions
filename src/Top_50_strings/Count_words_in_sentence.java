package Top_50_strings;

public class Count_words_in_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world my name is vikash mishra";
		int count=0;
		String [] str= s.split(" ");
		for(int i=0;i<str.length; i++) {
         count++;
		}
		System.out.println(count);
	}

}
