// StackEmptyException.java
/**
 * Exception thrown when an operation is attempted on an empty stack.
 * This is a runtime exception and indicates that the stack is empty when an operation like pop or peek is attempted.
 *
 * @author Adrian
 * @version 20.02.2025
 */
public class StackEmptyException extends RuntimeException {
    /**
     * Constructs a new StackEmptyException with the specified detail message.
     * @param message the detail message, which is saved for later retrieval
     */
    public StackEmptyException(String message) {
        super(message);
    }
}