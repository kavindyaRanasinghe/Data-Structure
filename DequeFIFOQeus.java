package Algorithms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DequeFIFOQeus {


    private Queue<Integer> frontQueue;
    private Queue<Integer> backQueue;

    public DequeFIFOQeus() {
        frontQueue = new LinkedList<>();
        backQueue = new LinkedList<>();
    }

   
    public void addFront(int item) {
        frontQueue.offer(item);
    }

   
    public void addBack(int item) {
        backQueue.offer(item);
    }

    
    public int removeFront() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot remove element.");
            return -1;
        }
        if (!frontQueue.isEmpty()) {
            return frontQueue.poll();
        } else {
            transferElements(backQueue, frontQueue);
            return frontQueue.poll();
        }
    }

   
    public int removeBack() {
        if (isEmpty()) {
            System.out.println("Deque is empty. Cannot remove element.");
            return -1;
        }
        if (!backQueue.isEmpty()) {
            return backQueue.poll();
        } else {
            transferElements(frontQueue, backQueue);
            return backQueue.poll();
        }
    }

    
    public boolean isEmpty() {
        return frontQueue.isEmpty() && backQueue.isEmpty();
    }

    
    private void transferElements(Queue<Integer> sourceQueue, Queue<Integer> destinationQueue) {
        while (!sourceQueue.isEmpty()) {
            destinationQueue.offer(sourceQueue.poll());
        }
    }

    
    public void display() {
        System.out.print("Deque: ");
        for (int item : frontQueue) {
            System.out.print(item + " ");
        }
        for (int item : backQueue) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
    	DequeFIFOQeus deque = new DequeFIFOQeus();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add to Front");
            System.out.println("2. Add to Back");
            System.out.println("3. Remove from Front");
            System.out.println("4. Remove from Back");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to add to the front: ");
                    int itemFront = scanner.nextInt();
                    deque.addFront(itemFront);
                    deque.display();
                    break;
                case 2:
                    System.out.print("Enter the element to add to the back: ");
                    int itemBack = scanner.nextInt();
                    deque.addBack(itemBack);
                    deque.display();
                    break;
                case 3:
                    int removedFront = deque.removeFront();
                    if (removedFront != -1)
                        System.out.println("Removed from front: " + removedFront);
                    deque.display();
                    break;
                case 4:
                    int removedBack = deque.removeBack();
                    if (removedBack != -1)
                        System.out.println("Removed from back: " + removedBack);
                    deque.display();
                    break;
                case 5:

            }
        }
    }
}
        
