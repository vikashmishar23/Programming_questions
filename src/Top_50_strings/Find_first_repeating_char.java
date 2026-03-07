package Top_50_strings;

public class Find_first_repeating_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		int [] count= new int [256];
		int n=s.length();
		for(int i=0; i<s.length(); i++) {
			count[s.charAt(i)]++;
		}
       for(int j=0 ; j<n; j++) {
    	   if(count[s.charAt(j)]==2) {
    		   char ch= s.charAt(j);
    		   System.out.println(ch);
    		   return;
    	   }
       }

	}

}
