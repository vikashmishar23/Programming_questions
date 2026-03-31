package link_list;

public class Create_linklist {
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
			head=n2;
			return;
		}
		
		node lastnode=head;
		while(lastnode.next!=null) {
			lastnode= lastnode.next;
		}
		lastnode.next= n2;
	}
	
	public void printlist() {
		node curr= head;
		while(curr.next!=null) {
			
			System.out.print(curr.data+"->");
			curr= curr.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Create_linklist list= new Create_linklist();
		list.addfirst(0);
		list.addlast(1);
		list.addlast(2);
		list.addlast(3);
		list.printlist();

	}

}
