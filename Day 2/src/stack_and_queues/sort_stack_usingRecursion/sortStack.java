package stack_and_queues.sort_stack_usingRecursion;

import java.util.Stack;

public class sortStack {


    // Function to sort a stack
    public static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Pop the top element
            int temp = stack.pop();

            // Recursively sort the remaining stack
            sort(stack);

            // Insert the popped element in sorted order
            insertSorted(stack, temp);
        }
    }

    // Helper function to insert an element in a sorted stack
    private static void insertSorted(Stack<Integer> stack, int element) {
        // If stack is empty or element is greater than the top element, push it
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }

        // Otherwise, pop the top element and insert the given element at the correct position
        int temp = stack.pop();
        insertSorted(stack, element);

        // Push back the popped element
        stack.push(temp);
    }
}