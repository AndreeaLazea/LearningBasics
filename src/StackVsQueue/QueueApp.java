package StackVsQueue;
import java.util.LinkedList;
import java.util.Queue;
public class QueueApp {
    //QUEUE
    // = FIFO, first in first out
    // = like a line at a store
    // = add() adds to the end of the queue
    // = remove() removes from the front of the queue
    // = peek() looks at the front of the queue
    // = element() looks at the front of the queue
    // = poll() removes from the front of the queue
    // = offer() adds to the end of the queue
    // = isEmpty() checks if the queue is empty
    // = size() returns the size of the queue
    // = used in BFS, CPU scheduling, etc.
    // = needs java.util.Queue import
    // = and needs java.util.LinkedList import

    public static void queue(){
        Queue<Integer> q = new LinkedList<>();
        q.add(20); // adds to the end of the queue
        q.add(30);
        q.add(213);
        // the current order is: 20, 30, 213.
        System.out.println(q);
        q.remove(); // removes from the front of the queue
        // the current order is: 30, 213.
        System.out.println(q);

    }
}
