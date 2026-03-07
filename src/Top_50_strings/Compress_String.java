package Top_50_strings;

public class Compress_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabaccb";
		int count;
		
		for(int i=0; i<s.length(); i++) {
			count=1;
			
			for(int j=i+1; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			boolean alreadyprinted=false;
			
			for(int k=0; k<i; k++) {
				if(s.charAt(i)==s.charAt(k)) {
					alreadyprinted=true;
					break;
				}
			}
			if(!alreadyprinted) {
				System.out.print(s.charAt(i)+""+ count);
			}
			
		}

	}

}
