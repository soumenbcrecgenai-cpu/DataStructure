package com.framework.Stack;

public class designaqueuqusingarray {
	int [] queue; 
	int count;
    int front;  
    int rear;
    int size;
    designaqueuqusingarray(int size)  {
        this.size = size;              
        queue = new int[size]; 
        front = 0;
        rear = -1; 
        count =0;
        }

    public void enqueue(int  value) {
    	if(rear==size-1) {
    		System.out.println(" Full");  
            return;                    
    	}
    	queue[++rear] = value;
		System.out.println(value+" Enqueued");  
		++count;
    	
    }
    void Remove() {
        if(rear == -1) {
            System.out.println("Queue Is Empty.");
            return;
        }
        
        System.out.println(queue[front] + " Is Removed");
        ++front;
        --count;
    }
    void Display() {
        if(rear == -1 || count == 0) {
            System.out.println("Queue Is Empty.");
            return;
        }
        
        for(int i = front; i <= rear; ++i) 
        {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

