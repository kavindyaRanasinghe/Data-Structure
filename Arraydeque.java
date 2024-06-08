package Algorithms;

public class  Arraydeque{
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    public Arraydeque(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int item = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + item);
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return queue[front];
    }

    public static void main(String[] args) {
        Arraydeque queue = new Arraydeque(4);

        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(9);  

        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue());  
        System.out.println(queue.dequeue());  
        System.out.println(queue.dequeue());  
    }
}
	

