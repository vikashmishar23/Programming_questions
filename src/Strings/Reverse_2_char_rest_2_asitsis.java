package Strings;

public class Reverse_2_char_rest_2_asitsis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdef";
		int k=2;
		char [] ch=s.toCharArray();
		int i=0;
		while(i<ch.length) {
			if(i+1< ch.length) {
				char temp=ch[i];
				ch[i]=ch[i-1];
				ch[i-1]=temp;			
			}
			i=i+(k+2);
		}
		
		for(char c:ch) {
			System.out.print(c);
		}

	}

}
