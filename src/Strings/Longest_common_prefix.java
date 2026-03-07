package Strings;

public class Longest_common_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="flower flow flwn";
		String [] str= s.split(" ");
		String str1= str[0];
		String str2=str[str.length-1];
		int x=0;
		while(x<str1.length() && x<str2.length()) {
			if(str1.charAt(x)!=str2.charAt(x)) {
				break;
			}
			x++;
		}
		System.out.println(str1.substring(0,x));

	}

}
