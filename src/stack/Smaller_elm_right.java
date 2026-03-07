package stack;
import java.util.*;
public class Smaller_elm_right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,5,0,2,9,8,1,};
		Vector<Integer> vt= new Vector<>();
		Stack<Integer> st= new Stack<>();
		
		for(int  i=arr.length-1; i>=0 ; i--) {
			if(st.size()==0) {
				vt.add(-1);
			}
			else if(st.size()>0 && st.peek()<arr[i]) {
				vt.add(st.peek());
			}
			
			else if(st.size()>0 && st.peek()>arr[i]) {
				while(st.size()>0 && st.peek()>arr[i]) {
					st.pop();
				}
				if(st.size()==0) {
					vt.add(-1);
				}else {
					vt.add(st.peek());
				}
			}
			st.push(arr[i]);
		}
		System.out.println(vt.reversed());

	}

}
