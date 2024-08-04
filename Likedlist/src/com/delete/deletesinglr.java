package com.delete;


class Node{
	int data;
	Node next;
	Node(int freshdata){
		this.data=freshdata;
		this.next=null;
	}
}
public class deletesinglr {
//Fuction to delete a node at a given position
	public static Node deleteNode(Node head,int position) {
		Node temp=head;
		Node prev=null;
		//Base case if linked list is empty
		if(temp==null)
			return head;
		//Case 1:Head is to be deleted
		if(position==1) {
			head=temp.next;
			return head;
		}
		//Case 2:Node to be deleted is in middle
		//Traverse till given node
		for(int i=1;temp!=null&&i<position;i++) {
			prev=temp;
			temp=temp.next;
		}
		//If given position is found,delete node 
		if(temp!=null) {
			prev.next=temp.next;//change addr of head to next
		}
		else {
			System.out.println("Data not present");
		}
		return head;
	}
	public static void printList(Node head) {
		//iteration OR traversal means going through one by one
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data+" ");
			curr=curr.next;
		}	
		System.out.println();
	}
	public static void main(String args[]) {
		//Create the linked list 2->3->4->5
		Node head=new Node(12);
		head.next=new Node(31);
		head.next.next=new Node(89);
		head.next.next.next=new Node(55);
		System.out.println("Original Linked List:");
		printList(head);
		System.out.println("List After Deletion ");
		int position=2;
		head=deleteNode(head,position);
		printList(head);
}
}
