package Top_50_strings;

public class Reverse_each_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s=" hello world my name is vikash mishra";
	      String [] str= s.split(" ");
	      String news="";
	      for(int i=0; i<str.length; i++) {
	    	  String word=str[i]+" ";
	    	  String newword=" ";
	    	   for(int j=word.length()-1; j>=0; j--) {
	    		   newword= newword+ word.charAt(j)+"";
	    	   }
	    	   news= news+newword;
	      }
	      System.out.println(news);

	}

}
