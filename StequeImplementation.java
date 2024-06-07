package Algorithms;


import java.util.NoSuchElementException;


public class StequeImplementation<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    private static class Node<T> {
        private T item;
        private Node<T> next;

        public Node(T item) {
            this.item = item;
            this.next = null;
        }
    }

    public StequeImplementation() {
        front = null;
        rear = null;
        size = 0;
    }

    // Add an element to front
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            newNode.next = front;
            front = newNode;
        }
        size++;
    }

    // Remove an element from front
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Steque is empty.");
        }
        T item = front.item;
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
        return item;
    }

    // Add an element to end 
    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    // Check the steque is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Get the size 
    public int size() {
        return size;
    }

    // Display the current state
    public void display() {
        Node<T> current = front;
        System.out.print("Steque: ");
        while (current != null) {
            System.out.print(current.item + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StequeImplementation<Integer> steque = new StequeImplementation<>();
        steque.push(17);
        steque.push(26);
        steque.enqueue(56);
        steque.enqueue(34);
        steque.display();
        
        System.out.println("Popped: " + steque.pop());
        steque.display();
        
        steque.push(56);
        steque.enqueue(76);
        steque.display();
        
        System.out.println("Popped: " + steque.pop());
        steque.display();
    }
}

    


