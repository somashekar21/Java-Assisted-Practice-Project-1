package programs;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack {
    private List<Integer> elements;

    // Constructor to initialize an empty stack
    public Stack() {
        this.elements = new ArrayList<>();
    }

    // Function to insert an element into the stack (push)
    public void push(int element) {
        elements.add(element);
        System.out.println("Pushed: " + element);
    }

    // Function to remove the top element from the stack (pop)
    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        int poppedElement = elements.remove(elements.size() - 1);
        System.out.println("Popped: " + poppedElement);
        return poppedElement;
    }

    // Function to check if the stack is empty
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public static void main(String[] args) {
        // Create a stack
        Stack stack = new Stack();

        // Insert elements into the stack (push)
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Remove elements from the stack (pop)
        stack.pop();
        stack.pop();
        stack.pop();

        // Try popping from an empty stack (this will throw an exception)
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Cannot pop from an empty stack.");
        }
    }
}

