package link_list;

import link_list.Create_linklist.node;

public class Reverse_linklist {
node head;
	
	class node{
		int data;
		node next;
		
		node(int data){
			this.data=data;
			this.next= null;
		}
	}
	public void addfirst(int data) {
		node n1= new node(data);
		if(n1.next==null) {
			head= n1;
	
		}
	}
	
	public void addlast(int data) {
		node n2= new node(data);
		if(head==null) {
			head= n2;
			return;
		}
		
		node lastnode= head;
		while(lastnode.next!=null) {
			lastnode=lastnode.next;
		}
		lastnode.next= n2;
		
	}
	
	public void reverse() {
		node curr=head, prev=null,temp;
		
		while(curr!=null) {
			temp= curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		node val=prev;
		while(val!=null) {
			System.out.print(val.data+"->");
			val=val.next;
		}
		System.out.println("null");
		
	}
	
	public void printlist() {
		node curr= head;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_linklist list= new Reverse_linklist();
		list.addfirst(0);
		list.addlast(1);
		list.addlast(2);
		list.printlist();
		
		list.reverse();

	}

}
