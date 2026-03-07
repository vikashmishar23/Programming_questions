package Top_50_strings;

public class String_palandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s="madam";
   String news="";
      for(int i=s.length()-1; i>=0; i--) {
	   news= news+ s.charAt(i);
       }
      System.out.println(s.equals(news));
	}

}
