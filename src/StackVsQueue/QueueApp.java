package StackVsQueue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // Adding elements to the queue
        q.add(20);
        q.offer(30); // Similar to add but returns false instead of throwing an exception on failure
        q.add(213);

        // Current order: 20, 30, 213
        System.out.println("Queue after additions: " + q);

        // Removing elements from the queue
        System.out.println("Removed element: " + q.remove()); // Removes the first element (20)
        System.out.println("Queue after removal: " + q);

        // Peeking at the front element without removing it
        System.out.println("Front element: " + q.peek()); // Shows the front element (30)
        System.out.println("Element at front: " + q.element()); // Similar to peek but throws an exception if empty

        // Polling to remove the front element
        System.out.println("Polled element: " + q.poll()); // Removes and returns the front element (30)
        System.out.println("Queue after polling: " + q);

        // Checking if the queue is empty
        System.out.println("Is the queue empty? " + q.isEmpty());

        // Getting the size of the queue
        System.out.println("Size of queue: " + q.size());

        // Attempting to remove from an empty queue to demonstrate exception handling
        try {
            q.remove();
        } catch (Exception e) {
            System.out.println("Exception on removing from empty queue: " + e.getMessage());
        }

        // Attempting to poll from an empty queue to see the result
        System.out.println("Polling from empty queue: " + q.poll()); // Returns null
    }
}
