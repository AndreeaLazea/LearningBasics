package StackVsQueue;

import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        // Push elements onto the stack
        s.push(20); // adds to the top of the stack
        s.push(30);
        s.push(213);
        // The current order (from bottom to top) is: 20, 30, 213.
        System.out.println("Stack after pushes: " + s);

        // Pop an element from the top of the stack
        System.out.println("Popped element: " + s.pop()); // removes 213 from the top
        // The current order is: 20, 30.
        System.out.println("Stack after pop: " + s);

        // Peeking at the top element of the stack without removing it
        System.out.println("Element at top (peek): " + s.peek()); // Shows 30

        // Checking if the stack is empty
        System.out.println("Is the stack empty? " + s.empty()); // Returns false

        // Searching for an element in the stack
        int position = s.search(20); // 1-based position from the top of the stack
        System.out.println("Position of 20 in the stack: " + position); // Should return 2 since 20 is 2 positions from the top

        // Getting the size of the stack
        System.out.println("Size of the stack: " + s.size()); // Returns 2
    }
}
