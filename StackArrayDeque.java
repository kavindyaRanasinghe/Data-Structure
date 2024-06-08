package Algorithms;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackArrayDeque {

    public static class Stack {
        private Deque<Integer> stack;

        public Stack() {
            stack = new ArrayDeque<>();
        }

        // Push operation to add an element to the top of the stack
        public void push(int item) {
            stack.push(item);
            System.out.println("Pushed: " + item);
        }

        // Pop operation to remove and return the top element of the stack
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            int item = stack.pop();
            System.out.println("Popped: " + item);
            return item;
        }

        // Peek operation to return the top element without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return -1;
            }
            return stack.peek();
        }

        // Method to check if the stack is empty
        public boolean isEmpty() {
            return stack.isEmpty();
        }

        // Method to get the size of the stack
        public int size() {
            return stack.size();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element is: " + stack.peek());  // Output: 3

        System.out.println(stack.pop());  // Output: Popped: 3
        System.out.println(stack.pop());  // Output: Popped: 2
        System.out.println(stack.pop());  // Output: Popped: 1
        System.out.println(stack.pop());  // Output: Stack is empty! -1
    }
}
