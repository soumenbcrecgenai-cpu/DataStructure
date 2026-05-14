package com.java.Traningsession.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList List =new SinglyLinkedList();
		List.InsertAtBeginning(1);
		List.InsertAtEnd(3);
		List.InsertAtPosition(5, 2);
		List.DeleteAtPosition(10);
		List.DeleteAtValue(1);
		List.Display();
		System.out.print(List.Search(3));

	}

}
