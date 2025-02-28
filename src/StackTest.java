/**
 * StackTest class is designed to thoroughly test the GenericStack class.
 * It includes both number (Integer) and text (String) stack tests.
 * The scenarios test regular operations, error handling, and edge cases.
 *
 * @author Adrian
 * @version 20.02.2025
 */
public class StackTest {
    /**
     * The main method to run tests on the GenericStack class.
     * It includes tests for both Integer and String stacks.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Integer Stack
        System.out.println("Testing Integer Stack:");
        GenericStack<Integer> intStack = new GenericStack<>(3);  // Create stack with capacity of 3

        // Push
        try {
            intStack.push(10);  // Push integer 10
            intStack.push(20);  // Push integer 20
            intStack.push(30);  // Push integer 30

            //current stack status (pop and peek test)
            System.out.println("Current stack: " + intStack.list());
            System.out.println("Peek top element: " + intStack.peek());  // Peek top element
            System.out.println("Pop top element: " + intStack.pop());  // Pop top element
            System.out.println("Stack after pop: " + intStack.list());

            // Trigger StackFullException
            System.out.println("Trigger StackFullException(push from full stack):");
            intStack.push(60);  // Should throw StackFullException

        } catch (StackFullException e) {
            System.out.println("Error: " + e.getMessage());  // Handle full stack error
        }

        // Pop all elements while testing pop = important to print current stack per element
        try {
            System.out.println("Current stack: " + intStack.list());
            System.out.println("Peek top element: " + intStack.peek());
            System.out.println("Pop top element: " + intStack.pop());
            System.out.println("Stack after pop: " + intStack.list());

            System.out.println("Current stack: " + intStack.list());
            System.out.println("Peek top element: " + intStack.peek());
            System.out.println("Pop top element: " + intStack.pop());
            System.out.println("Stack after pop: " + intStack.list());

            System.out.println("Current stack: " + intStack.list());
            System.out.println("Peek top element: " + intStack.peek());
            System.out.println("Pop top element: " + intStack.pop());
            System.out.println("Stack after pop: " + intStack.list());

            // Attempt to pop from an empty stack
            System.out.println("Pop from empty stack:");
            intStack.pop();  // Should throw StackEmptyException

        } catch (StackEmptyException e) {
            System.out.println("Error: " + e.getMessage());  // Handle empty stack error
        }





        // Test with String Stack
        System.out.println("\nTesting String Stack:");
        GenericStack<String> stringStack = new GenericStack<>(3);  // Stack with capacity 3

        // Push some elements onto the stack
        try {
            stringStack.push("Apple");  // Push "Apple"
            stringStack.push("Banana");  // Push "Banana"
            stringStack.push("Carrot");  // Push "Cherry"

            //current stack status
            System.out.println("Current stack: " + stringStack.list());
            System.out.println("Peek top element: " + stringStack.peek());  // Peek the top element
            System.out.println("Pop top element: " + stringStack.pop());  // Pop the top element
            System.out.println("Stack after pop: " + stringStack.list());

            // Attempt to push beyond capacity to trigger StackFullException
            System.out.println("Attempting to push beyond capacity:");
            stringStack.push("Date");  // Should throw StackFullException

        } catch (StackFullException e) {
            System.out.println("Error: " + e.getMessage());  // Handle the full stack error
        }

        // Pop all elements and test the empty stack scenario
        try {
            System.out.println("Current stack: " + stringStack.list());
            System.out.println("Peek top element: " + stringStack.peek());
            System.out.println("Pop top element: " + stringStack.pop());
            System.out.println("Stack after pop: " + stringStack.list());

            System.out.println("Current stack: " + stringStack.list());
            System.out.println("Peek top element: " + stringStack.peek());
            System.out.println("Pop top element: " + stringStack.pop());
            System.out.println("Stack after pop: " + stringStack.list());

            System.out.println("Current stack: " + stringStack.list());
            System.out.println("Peek top element: " + stringStack.peek());
            System.out.println("Pop top element: " + stringStack.pop());
            System.out.println("Stack after pop: " + stringStack.list());

            //pop from an empty stack
            System.out.println("Pop from empty stack:");
            stringStack.pop();  // Should throw StackEmptyException

        } catch (StackEmptyException e) {
            System.out.println("Error: " + e.getMessage());  // Handle the empty stack error
        }

        // Testing Capacity 0
        System.out.println("\nTesting Stack with Capacity 0:");
        try {
            GenericStack<Integer> zeroCapacityStack = new GenericStack<>(0);  // Stack with capacity 0
            zeroCapacityStack.push(1);  // Should throw StackFullException as stack can't hold any element
        } catch (StackFullException e) {
            System.out.println("Error: " + e.getMessage());  // Handle the full stack error
        }
    }
}
