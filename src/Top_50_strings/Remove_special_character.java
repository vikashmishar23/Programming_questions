package Top_50_strings;

public class Remove_special_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="he@l#lo";
	//	expected output= hello
		String news=" ";
		
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(Character.isLetter(ch)) {
				news= news+ch;
			}
		}
  System.out.println(news);
	}

}
