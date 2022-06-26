package exceptions;


public class ChangeBacklogStateException extends Exception {

    public ChangeBacklogStateException(String message) {
        super(message);
        System.out.println("STATE CHANGE EXCEPTION: " + message);
    }
}
