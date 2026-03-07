package Strings;

public class First_non_repeting_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world!";
		int [] count= new int[256];
		
		for(int i=0; i<s.length(); i++) {
			count[s.charAt(i)]++;
		}
		int n=s.length();
		for(int i=0; i<n; i++) {
			if(count[s.charAt(i)]==1) {
				System.out.println(s.charAt(i));
				break;
			}
		}

	}

}
