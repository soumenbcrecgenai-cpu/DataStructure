package com.java.Traningsession.LinkedList;

// Creating a Single Node
public class Node {
	
	int data;//To store the Value
	Node next;//To store the address of Next Node
	Node(int data){
		this.data= data;
		this.next= null;//Next should be Null after every append of New Node
	}
}
