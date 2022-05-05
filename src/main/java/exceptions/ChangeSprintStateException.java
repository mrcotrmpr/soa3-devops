package Exceptions;

public class ChangeSprintStateException extends Exception{

    public ChangeSprintStateException(String message) {
        super(message);
        System.out.println("STATE CHANGE EXCEPTION: " + message);
    }
}
