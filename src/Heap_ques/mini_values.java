package Heap_ques;

import java.util.Collections;
import java.util.PriorityQueue;

public class mini_values {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,10,3,15,7,8,17,5};
		int k=3;
		PriorityQueue<Integer> heap= new PriorityQueue<>(Collections.reverseOrder());
		for(int elm: arr) {
			if(heap.size()< k) {
				heap.add(elm);
			}else {
				if(heap.peek()> elm) {
					heap.poll();
					heap.add(elm);
				}
			}
		}
		System.out.println(heap.peek());
	}

}
