/**
 * Exception thrown when an operation is attempted on a full stack.
 * This is a runtime exception and indicates that the stack has reached its maximum capacity.
 *
 * @author Adrian
 * @version 20.02.2025
 */
public class StackFullException extends RuntimeException {
    /**
     * Constructs a new StackFullException with the specified detail message.
     * @param message the detail message, which is saved for later retrieval
     */
    public StackFullException(String message) {
        super(message);
    }
}