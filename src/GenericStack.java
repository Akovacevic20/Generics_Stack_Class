/**
 * A generic stack implementation using an array.
 * This class provides basic stack operations such as push, pop, peek, and listing the stack elements.
 *
 * @param <T> The type of elements in this stack.
 */
public class GenericStack<T> {	//List as Array T Type not specified = parameter for class
    private Object[] elements;	//not private T[] elements = new T[10]??? = (T[]) new Object[10]
    // = resort to runtime polymorphism as Array create not the generics way
    private int size;	//how big it is
    private int top; //top element incremetn it if something has been added how many are there
    //0-9 = [10]

    // size 10 Default
    /**
     * Default constructor to initialize the stack with a default capacity of 10.
     */
    public GenericStack() {
        this(10);
    }

    // Constructor custom capazity
    /**
     * Constructor to initialize the stack with a custom capacity.
     *
     * @param capacity The capacity of the stack. Must be greater than 0.
     * @throws IllegalArgumentException If the capacity is less than or equal to 0.
     */
    public GenericStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Wrong");
        }
        this.elements = new Object[capacity];	//new one is first to be called
        this.size = capacity;
        this.top = -1;	//tunrs into zero with push
    }

//now methods where exceptions that we defined shall be thrown


    // add an element to the stack
    /**
     * Adds an element to the top of the stack.
     *
     * @param element The element to be added to the stack.
     * @throws StackFullException If the stack is full and cannot accommodate more elements.
     */
    public void push(T element) {	//is kinda built like add method takes T as parameter
        //adds on top of last element
        if (top == size - 1) {  //if size=10 9 would be full
            throw new StackFullException("Stack is full " + element);
        }
        elements[++top] = element;	//increment top	//add element
    }

    //remove and return the top element
    /**
     * Removes and returns the top element from the stack.
     *
     * @return The top element of the stack.
     * @throws StackEmptyException If the stack is empty.
     */
    public T pop() {	//return value is of type T
        // takes last added element away
        if (top == -1) {	// Check if the stack is empty
            throw new StackEmptyException("Stack is empty. Cannot pop element.");
        }
        @SuppressWarnings("unchecked")
        T element = (T) elements[top];	//correct casting Top element//correct [index]
        elements[top--] = null; // Avoid memory leak //correct decrement //And removal
        //replaces with null
        return element;
    }

    // view top element without removing
    /**
     * Returns the top element without removing it from the stack.
     *top is always the one that has been added last
     * @return The top element of the stack.
     * @throws StackEmptyException If the stack is empty.
     */
    public T peek() {
        if (top == -1) {	// Check if the stack is empty
            throw new StackEmptyException("Stack is empty. Cannot peek element.");
        }
        return (T) elements[top];	//returns top element
    }


    //Furthermore, the class should provide method list
    //all elements of stack into string separated by ;

    // Method to list all stack elements as a ;-separated string
    /**
     * Lists all elements in the stack as a semicolon-separated string.
     *
     * @return A string representation of all stack elements.
     */
    public String list() {
        if (top == -1) {	// Check if the stack is empty
        }
        String result = "";
        for (int i = 0; i <= top; i++) {
            result += (elements[i] != null ? elements[i].toString() : "null");	//	1;Hello;3.14;true ???? all elements
            if (i < top) {
                result += ";";
            }
        }
        return result;
    }
    //Integer.valueOf???
}
