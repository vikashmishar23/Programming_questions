package Top_50_strings;

public class Subsequence_abc {
	public static void subsequence(String str, int idx, String news) {
		if(idx==str.length()) {
			System.out.println(news);
			return;
		}
		 char ch= str.charAt(idx);
		 subsequence(str,idx+1, news+ch);
		 subsequence(str,idx+1, news);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		subsequence(str,0, "");

	}

}
