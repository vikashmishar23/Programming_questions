package Top_50_array;

import java.util.Collections;
import java.util.PriorityQueue;

public class K_th_smallest_elm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {7,8,4,3,9,10};
		int k=2;
		PriorityQueue<Integer> heap= new PriorityQueue<>();
		
		for(int elm: arr) {
			if(heap.size()< k) {
				heap.add(elm);
			}else {
				if(heap.peek()< elm) {
					heap.poll();
					heap.add(elm);
				}
			}
		}
      System.out.println(heap.peek());
	}

}
