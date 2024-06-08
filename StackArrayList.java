package Algorithms;

import java.util.ArrayList;

public class StackArrayList {
    private ArrayList<Integer> stack;

    
    public StackArrayList() {
        stack = new ArrayList<>();
    }

    
    public void push(int item) {
        stack.add(item);
        System.out.println("Pushed: " + item);
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int item = stack.remove(stack.size() - 1);
        System.out.println("Popped: " + item);
        return item;
    }

  
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return stack.get(stack.size() - 1);
    }

 
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    
    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        StackArrayList stack = new StackArrayList();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is: " + stack.peek());  

        System.out.println(stack.pop());  
        System.out.println(stack.pop());  
        System.out.println(stack.pop());  
        System.out.println(stack.pop());  
    }
	}


