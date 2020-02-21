package InterviewCoding;

public class ImplementStack {

	class Stack {
		private int array[]; // data structure - array
		private int top; // pointing to the top of the stack
		private int capacity; 
		
	// Stack constructor
	Stack (int capacity) { 
		this.array = new int[capacity]; // creating new int array of size - capacity 
		this.capacity = capacity;
		this.top = -1;
	}
	
	// push - pushes the item to the stack
	public void push(int item) {
		if (isFull()) {
			throw new RuntimeException("Stack is full");
		}
		array[++top] = item;
	}
	

	// top - returns int which is the number on the top of the stack (removes the element)
	public int pop() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return array[top--];
	}
	
	// peek - returns the top of the stack, but does not modify the stack
	public int peek() {
		if (isEmpty()) {
			throw new RuntimeException("Stack is empty");
		}
		return array[top];
	}
	
	// method checking if stack is empty
	public boolean isEmpty() {
		return top == -1;
	}
	
	// method checking if stack is full
	public boolean isFull() {
		return top == capacity - 1;
	}
	
	
	
	}

}
