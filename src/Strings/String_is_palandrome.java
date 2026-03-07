package Strings;

public class String_is_palandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		String news="";
		for(int i=s.length()-1; i>=0; i--) {
			news= news+ s.charAt(i);	
		}
		
		if(s.equals(news)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
