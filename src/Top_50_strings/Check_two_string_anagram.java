package Top_50_strings;

public class Check_two_string_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s="abcd";
         String p="bcda";
         int [] count= new int[256];
         
         for(int i=0; i<s.length(); i++) {
        	 count[s.charAt(i)]++;
         }
         
         for(int i=0; i<p.length(); i++) {
        	 count[p.charAt(i)]--;
         }
         
         for(int i=0; i<count.length; i++) {
        	 if(count[i]!=0) {
        		System.out.println("false"); 
        		return;
        	 }
         }
     System.out.println("true");
	}

}
