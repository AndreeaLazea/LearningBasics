package StackVsQueue;

import java.util.Stack;

public class StackApp {
    //STACK
    // = LIFO, last in first out
    // = like a stack of plates
    // = push() adds to the top of the stack
    // = pop() removes from the top of the stack
    // = peek() looks at the top of the stack
    // = empty() checks if the stack is empty
    // = search() searches for an element in the stack
    // = size() returns the size of the stack
    // = capacity() returns the capacity of the stack
    // = used in backtracking, undo operations, function calls, etc.
    // = needs java.util.Stack import
    public static void stack() {
        Stack<Integer> s = new Stack<>();
        s.push(20); // adds to the top of the stack
        s.push(30);
        s.push(213);
        // the current order is: 213, 30, 20.
        System.out.println(s);
        s.pop(); // removes from the top of the stack
        // the current order is: 30, 20.
        System.out.println(s);
    }

}
