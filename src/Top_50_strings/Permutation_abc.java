package Top_50_strings;

public class Permutation_abc {
	public static void permutation(String str, String ans) {
		if(str.length()==0) {
			System.out.println(ans);
			//return;
		}
		
		for(int i=0; i<str.length(); i++) {
		char ch=str.charAt(i);
		String left= str.substring(0, i);
		String right= str.substring(i+1);
		String root=left + right;
		
		permutation(root,ans+ch);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		permutation(str,"");

	}

}
