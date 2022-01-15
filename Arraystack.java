package toto;
import java.util.*;

public class Arraystack {
	
	private Employee [] stack;
	private int top;
	
	
	public Arraystack(int capacity) {
		
		stack = new Employee[capacity];
		
	}
	
	public void push(Employee employee) {
		
		if(top==stack.length) {
			
			Employee [] newarr = new Employee[2*stack.length];
			System.arraycopy(stack, 0, newarr, 0, stack.length);
			stack = newarr;
			 
		}
		stack[top++]=employee;
		
		
	}
	public Employee pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Employee employee = stack[--top];
		stack[top]=null;
		return employee;
		
		
	}
	public Employee peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];
		
	}
	public boolean isEmpty() {
		return top==0;
	}
	
	public int size() {
		return top;
	}
	public void printStack() {
		for(int i = top-1;i>=0;i--) {
			System.out.println(stack[i]);
		}
	}

}
