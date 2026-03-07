package stack;
import java.util.*;
public class Greater_elm_right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// agar greater elm right bola h too array ulta chelga
		
		int [] arr= {1,3,2,4};
		          //{3,4,4,-1};
		
		Stack<Integer> st= new Stack<>();
		Vector<Integer> vt= new Vector<>();
		
		for(int i=arr.length-1; i>=0; i--) {
			if(st.size()==0) {
				vt.add(-1);
			}
			
			else if(st.size()>0 && st.peek()>arr[i]) {
				vt.add(st.peek());
			}
			
			else if(st.size()>0 && st.peek()<arr[i]) {
				
				while(st.size()>0 && st.peek()<arr[i]) {
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
