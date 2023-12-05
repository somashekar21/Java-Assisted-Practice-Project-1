package programs;

import java.util.LinkedList;

public class Queue {
    private LinkedList<Integer> elements;

    // Constructor to initialize an empty queue
    public Queue() {
        this.elements = new LinkedList<>();
    }

    // Function to insert an element into the queue (enqueue)
    public void enqueue(int element) {
        elements.addLast(element);
        System.out.println("Enqueued: " + element);
    }

    // Function to remove the front element from the queue (dequeue)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Cannot dequeue from an empty queue.");
            return -1; // Return a default value or throw an exception based on your requirement
        }

        int dequeuedElement = elements.removeFirst();
        System.out.println("Dequeued: " + dequeuedElement);
        return dequeuedElement;
    }

    // Function to check if the queue is empty
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public static void main(String[] args) {
        // Create a queue
        Queue queue = new Queue();

        // Insert elements into the queue (enqueue)
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Remove elements from the queue (dequeue)
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        // Try dequeuing from an empty queue
        queue.dequeue();
    }
}
