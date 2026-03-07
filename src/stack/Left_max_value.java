package stack;

import java.util.Stack;
import java.util.Vector;

public class Left_max_value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,4,1,7,6,0,7};
		// left max value of this array {-1,-1,4,-1,7,6,-1};
		Stack<Integer> st= new Stack<>();
		Vector<Integer> vt= new Vector<>();
		
		for(int i=0; i<arr.length; i++) {
			if(st.size()==0) {
				vt.add(-1);
			}
			else if(st.size()> 0 && st.peek() >= arr[i]) {
				vt.add(st.peek());
			}
			else if (st.size()> 0 && st.peek() <= arr[i]){
				
				while(st.size()> 0 && st.peek() <= arr[i]) {
					st.pop();
				}
				if(st.size()==0) {
					vt.add(-1);
				}else {
					vt.add(st.peek());
				}
			}
			st.add(arr[i]);
		}
		System.out.println(vt);

	}

}
