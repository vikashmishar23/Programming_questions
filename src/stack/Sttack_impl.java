package stack;

import org.w3c.dom.Node;

public class Sttack_impl {
	
	
	  static node  head;
	  
	  static  class node  {
		 int data;
		 node next;
		 
		 node(int data){
			 this.data=data;
			 this.next=null;
		 }
	 }
	  
	 public static void push(int data) {
		 node n1= new node(data);
		 n1.next=head;
		 head=n1;
	 }
	 
	 public  static int pop() {
		 if(isEmpty()) {
			 return -1;
		 }
		int top=head.data;
		head=head.next;
		return top;
	 }
	 
	 

	 private static boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	 public static int peek() {
		 if(isEmpty()) {
			 return -1;
		 }
		 return head.data;
	 }
	 
	 
	 public static void printlist() {
		  node curr=head;
		  while(curr!=null) {
			  System.out.print(curr.data+"->");
			  curr=curr.next;
		  }
		  System.out.println("null");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sttack_impl st=new Sttack_impl();
		st.push(1);
		st.push(0);
		st.push(7);
		
		st.printlist();

	}

}
