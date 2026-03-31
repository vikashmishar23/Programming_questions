package link_list;

import link_list.Middle_linklist.node;

public class Delete_nodes {
	node head;
	
	class node {
		int data;
		node next;
		
		node(int data){
			this.data=data;
			this.next= null;
		}
	}
	public void addfirst(int data) {
		node n1= new node(data);
		if(n1.next== null) {
			head=n1;
		}
	}
	
	public void addlast(int data) {
		node n2= new node(data);
		if(head==null) {
			head=n2;
		}
		node lastnode= head;
		while(lastnode.next!=null) {
			lastnode= lastnode.next;
		}
		lastnode.next=n2;
	}
	
	public void deletefirst() {
		if(head==null) {
			System.out.println(" empty!");
		}
		head=head.next;
	}
	
	public void deletelast() {
		if(head==null) {
			System.out.println(" empty!");
		}
		head=head.next;
		
		if(head.next==null) {
			head=null;
			return;		
		}
		
		node seclast=head;
		node lastnode= head.next;
		while(lastnode!=null) {
			lastnode=lastnode.next;
		}
		seclast.next=null;
		
	}
	
	public void printlist() {
		node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr=curr.next;
		}
		System.out.println("null");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delete_nodes list= new Delete_nodes();
		list.addfirst(1);
		list.addlast(2);
		list.addlast(3);
		list.addlast(4);
		list.printlist();
	//	list.deletelast();
		
		list.printlist();

	}

}
