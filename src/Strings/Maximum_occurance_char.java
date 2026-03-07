package Strings;

public class Maximum_occurance_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="fhagfdah";
		int max=-1;
		char ch=' ';
		int [] count= new int[256];
		
		for(int i=0; i<s.length(); i++) {
			count[s.charAt(i)]++;
		}
		int n=s.length();
		for(int j=0; j<n; j++) {
		if(max< count[s.charAt(j)]) {
			max=count[s.charAt(j)];
			ch=s.charAt(j);
		}
		}
		System.out.println(ch);
		

	}

}
