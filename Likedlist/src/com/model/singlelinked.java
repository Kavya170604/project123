package com.model;
class Node{
	int data;//instance variable
	Node next;//this is the reference object that store the memory address
	//next is called the instance object of same class
	Node(int freshdata){
		this.data=freshdata;
		this.next=null;
	}
}
public class singlelinked {
//Function to insert a new node at the beginning of the list
	public static Node insertAtFront(Node head,int fresh_data) {
		//Create a new node with the given data
		Node fresh_node=new Node(fresh_data);
		//Make the next of the new node point to current head
		fresh_node.next=head;
		//return the new node as the new head of the list
		return fresh_node;
	}
	//Methods appends a new node at the end of singly linked list and returns the head node
	public static Node insertAtEnd(Node head,int newData) {
		//Create a new node
		Node newNode=new Node(newData);
		//If the Linked List empty,make te new node as the head and return
		if(head==null) {
			return newNode;
		}
		//Store the head reference in a temporary variable
		Node last=head;
		//Traverse till the last node
		while(last.next!=null) {
			last=last.next;
		}
		//Change the next pointer of the last node to point to new node
		last.next=newNode;
		//Return the head of the list
		return head;	
	}
	public static Node insertPosition(Node head,int position,int data) {
		Node newNode=new Node(data);//allocating memory and initialize data for newNode
		//If inserting at the beginning
		while(position==1) {
			newNode.next=head;
			head=newNode;
			return head;
		}
		Node current=head;//save the head value
		for(int i=1;i<position-1&&current!=null;i++) {
			current=current.next;
		}
		//If the position is out of bounds
		if(current==null) {
			System.out.println("Position is outof bounds");
	        return head;
	        }
		newNode.next=current.next;//node at given posiqtion
		current.next=newNode;
		return head;                                                                                               
	}
	//Function to Insert a new node after a given node
	public static Node insertafterData(Node head,int key,int newData) {
		Node curr=head;
		//Iterate over Linked list to find the key
		while(curr!=null) {
			if(curr.data==key)
				break;
			curr=curr.next;
		}
		//if curr becomes null means,give key is not found in linked list
		if(curr==null) {
			return head;
		}
		//Allocate new node by given data and point the next of freshNode to curr's next and point current next to FreshNode
		Node freshNode=new Node(newData);
		freshNode.next=curr.next;
		curr.next=freshNode;
		return head;
	}
public static void printList(Node head) {
	//iteration OR traversal means going through one by one
	Node curr=head;
	while(curr!=null) {
		System.out.print(" "+curr.data);
		curr=curr.next;
	}	
	System.out.println();
}
public static void main(String args[]) {
	//Create the linked list 2->3->4->5
	Node head=new Node(2);
	head.next=new Node(3);
	head.next.next=new Node(4);
	head.next.next.next=new Node(2);
	//Print the original list
	System.out.println("Original Linked List:");
	printList(head);
	System.out.println("After inserting node at the front:");
	int data=1;
	head=insertAtFront(head,data);
	//print the updated list
	printList(head);
	System.out.println("After inserting node at the end:");
	int data1=6;
	head=insertAtEnd(head,data1);
	//print the updated list
	printList(head);
	System.out.println("After inserting node at the position:");
	int position=2;
	int data2=7;
	head=insertPosition(head,position,data2);
	//print the updated list
	printList(head);
	System.out.println("Inserting a new node after a given node:");
	int datas=2;
	int newData=9;
	head=insertafterData(head,datas,newData);
	printList(head);
}
}

