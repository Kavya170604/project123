package com.models;

import java.util.Scanner;

class Node{
	int data;//instance variable
	Node next;//this is the reference object that store the memory address
	//next is called the instance object of same class
	Node(int freshdata){
		this.data=freshdata;
		this.next=null;
	}
}
public class searchsingle {
	//Check whether key is present in linked list
	static boolean searchKey(Node head,int key) {
		//Initialize curr with the head of linked list
		Node curr=head;
		//Iterate over all the nodes
		while(curr!=null) {
			//If the current node's value is equal to key ,return true
			if(curr.data==key)
				return true;
			//Move to the next node
			curr=curr.next;
		}
		//If there is no node with value as key,return false
		return false;
	}
	//find position
	static int searchPos(Node head,int key) {
		int pos=0;
		//Initialize curr with the head of linked list
		Node curr=head;
		//Iterate over all the nodes
		while(curr!=null) {
			pos++;
			//If the current node's value is equal to key ,return true
			if(curr.data==key)
				return pos;
			//Move to the next node
			curr=curr.next;
		}
		//If there is no node with value as key,return 0
		return 0;
	}
	//find the number of elements
	static int Count(Node head) {
		int c=0;
		Node curr=head;
		while(curr!=null) {
			c++;
			curr=curr.next;
		}
		return c;
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
		//Print the original list
		System.out.println("Original Linked List:");
		printList(head);
		//key to search
		Scanner sc=new Scanner(System.in);
		int key =sc.nextInt();
		if(searchKey(head,key))//this command will execute searchkey method
			System.out.println("YES");
		else
			System.out.println("NO");
		//print the position
		int m=searchPos(head,key);
		System.out.println("Position is "+m);
		int count=Count(head);
		System.out.println("The number of element is: "+count);
}
}

//Time Complexity:O(N),Where N is the number of nodes in Linked List
//Auxiliary Space:O(1)