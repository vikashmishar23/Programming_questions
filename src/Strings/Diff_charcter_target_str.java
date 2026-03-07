package Strings;
import java.util.*;
public class Diff_charcter_target_str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abc";
		String t="abcdef";
		
		int [] count= new int[256];
		
		for(int i=0; i<t.length(); i++) {
			count[t.charAt(i)]++;
		}
		
		for(int i=0; i<s.length(); i++) {
			count[s.charAt(i)]--;
		}
		
		for(int j=0; j<count.length; j++) {
			
			if(count[j]>0) {
				System.out.println((char)j);
			}
		}
		
		
	}

}
