package Top_50_strings;

public class Minimum_occuring_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabbcdebfba";
		int [] count= new int[256];
		int min=Integer.MAX_VALUE;
		char ch=' ';
		
		for(int i=0; i<s.length(); i++) {
			count[s.charAt(i)]++;
		}
		int n=s.length();
		for(int j=0; j<n; j++) {
			
			if(count[s.charAt(j)]<min) {
				min=count[s.charAt(j)];
				ch= s.charAt(j);
			}
		}
     System.out.println(ch);

	}

}
