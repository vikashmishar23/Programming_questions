package Top_50_strings;

public class Count_vowels_consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello world";
		int vowels=0;
		int  consonant=0;
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u') {
				vowels++;
			}
			else {
				consonant++;
			}
		}
		System.out.println("vowels  "+ vowels);
		System.out.println("consonant  "+ consonant);

	}

}
