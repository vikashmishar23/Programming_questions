package Top_50_strings;

public class Reverse_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s=" hello world my name is vikash mishra";
      String [] str= s.split(" ");
      String news=" ";
      for(int i=str.length-1; i>=0; i--) {
    	  news= news+str[i]+ " ";
      }
      System.out.println(news);
	}

}
