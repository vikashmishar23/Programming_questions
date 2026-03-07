package Strings;

public class Substring_makes_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	String s="ababab";
	String t="ab";
	int l1=s.length();
	int l2=t.length();
	StringBuilder sb= new StringBuilder();
	
	if(l1%l2!=0) {
		System.out.println("false");
		return;
		
	}
	for(int i=0; i<l1/l2; i++) {
		sb.append(t);
	}
	
	if(sb.toString().equals(s)) {
		System.out.println("true");
	}else {
		System.out.println("false");
	}
	
	
	}

}
