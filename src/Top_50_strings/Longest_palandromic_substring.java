package Top_50_strings;

public class Longest_palandromic_substring {
	public static boolean palan(String s, int i, int j) {
		while(i<j) {
			char ch1=s.charAt(i);
			char ch2=s.charAt(j);
			if(ch1!=ch2) {
				return false;
			}
			i++;
			j--;
		}
		return true;	
	}
	
	public static void longest(String s) {
		int max=0, start=0, end=0;
		int n=s.length();
	  for(int i=0; i<s.length(); i++) {
		  for(int j=i; j<s.length(); j++) {
			  if(palan(s,i,j)) {
				  if(j-i+1>max) {
					  max=j-i+1;
					  start=i;
					  end=j;
					  
				  }
			  }
		  }
		  
	  }
	  System.out.println(s.substring(start, end+1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abdddejh";
		longest(s);

	}

}
