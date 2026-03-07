package Strings;

public class Longest_substr_without_repeting_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="abcbdab";
     int n= s.length();
     String news="";
     
     for(int i=0; i<s.length(); i++) {
    	 StringBuilder sb= new StringBuilder();
    	 
    	 for(int j=i; j<n; j++) {
    		 char ch=s.charAt(j);
    		 
    		 if(sb.toString().indexOf(ch)!=-1) {
    			 break;
    		 }
    		 sb.append(ch);
    		 
    		 if(sb.length() > news.length()) {
    			 news=sb.toString();
    		 }
    	 }
     }
     System.out.println(news);
  
	}

}
