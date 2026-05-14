package com.java.Traningsession.LinkedList; // Package declaration

// Creating a Singly Linked List Operation
public class SinglyLinkedList {
    
    private Node Head; // This is the Head Node pointer which points to the first Node
    
    // Function to insert New Node at the beginning of Linked List
    public void InsertAtBeginning(int Data) {
        Node NewNode = new Node(Data); // Allocate Memory for New Node
        NewNode.next = Head; // Assign the address of Head in the next of New Node
        Head = NewNode; // Point the Head Node pointer to New Node
    }
    
    // Function to insert New Node at the end of Linked List
    public void InsertAtEnd(int Data) {
        Node NewNode = new Node(Data); // Allocate Memory for New Node
        if(Head==null) { // If the linked list is empty
            Head = NewNode; // Make the new node as Head
            return; // Exit the function
        }
        Node DummyNode = Head; // Take a DummyNode pointer for Iteration
        while(DummyNode.next!=null) { // Iterate until it reaches the end of linked list
            DummyNode = DummyNode.next; // Move to the next node
        }
        DummyNode.next = NewNode; // Assign the Address of New Node to the next of the last node
    }
    
    // Function to Display the Linked List
    public void Display() {
        if(Head==null) { // If the linked list is empty
            System.out.println("Liked List is empty."); // Print message
            return; // Exit the function
        }
        
        Node DummyNode = Head; // Start from Head
        while(DummyNode!=null) { // Traverse until the end
            System.out.print(DummyNode.data+"-->"); // Print data of current node
            DummyNode = DummyNode.next; // Move to next node
        }
        System.out.println("Null"); // Indicate the end of the list
    }
    
    // Function to Search for a Node in the Linked List
    public boolean Search(int Data) {
        if(Head==null) { // If the linked list is empty
            System.out.print("Linked list is empty"); // Print message
        }
        Node DummyNode = Head; // Start from Head
        while(DummyNode!=null) { // Traverse until the end
            if(DummyNode.data==Data) { // If data matches
                return true; // If found, return true
            }
            DummyNode = DummyNode.next; // Move to next node
        }
        return false; // If not found, return false
    }
    
    // Function to Insert Node At Any Position
    public void InsertAtPosition(int Data,int Position) {
        if(Head==null) { // If the linked list is empty
            System.out.print("Linked list is empty"); // Print message
            return; // Exit function
        }
        if(Position<1) { // Position must be valid
            System.out.print("Position Must be Greater than equals to one"); // Print error
            return; // Exit function
        }
        Node NewNode = new Node(Data); // Create new node
        Node DummyNode = Head; // Start traversal from Head
        if(Position==1) { // If inserting at first position
            NewNode.next = Head; // Link new node to current Head
            Head = NewNode; // Update Head
            return; // Exit function
        }
        for(int i=1; i<Position-1 && DummyNode!=null; ++i) { // Traverse until position-1
            DummyNode = DummyNode.next; // Move to next node
        }
        if(DummyNode==null) { // If position is out of range
            System.out.println("position out of range"); // Print error
            return; // Exit function
        }
        NewNode.next = DummyNode.next; // Link new node to next node
        DummyNode.next = NewNode; // Link previous node to new node
    }
    
    // Function to Delete Node at a given Position
    public void DeleteAtPosition(int Position) {
        if(Head==null) { // If the linked list is empty
            System.out.print("Linked list is empty"); // Print message
            return; // Exit function
        }
        if(Position<1) { // Position must be valid
            System.out.print("Position Must be Greater than equals to one"); // Print error
            return; // Exit function
        }
        if(Position==1) { // If deleting the first node
            Head=Head.next; // Move Head to the next node
            return; // Exit function
        }
        Node DummyNode = Head; // Start traversal from Head
        for(int i=1;i<Position-1 && DummyNode !=null; ++i) { // Traverse until position-1
            DummyNode=DummyNode.next; // Move to next node
        }
        if(DummyNode==null) { // If position is out of range
            System.out.println("position out of range"); // Print error
            return; // Exit function
        }
        DummyNode.next=DummyNode.next.next; // Skip the node at given position
    }
    
    // Function to Delete Node by Value
    public void DeleteAtValue(int Data) {
        if(Head==null) { // If the linked list is empty
            System.out.print("Linked list is empty"); // Print message
            return; // Exit function
        }
        if(Head.data==Data) { // If the Head node contains the value
            Head=Head.next; // Move Head to the next node
            return; // Exit function
        }
        Node DummyNode=Head; // Start traversal from Head
        while(DummyNode.next != null && DummyNode.next.data!=Data) { // Traverse until value is found
            DummyNode=DummyNode.next; // Move to next node
        }
        if(DummyNode==null||DummyNode.next==null) { // If value not found
            System.out.println("Value not found"); // Print error
            return; // Exit function
        }
        DummyNode.next=DummyNode.next.next; // Skip the node containing the value
    }
}