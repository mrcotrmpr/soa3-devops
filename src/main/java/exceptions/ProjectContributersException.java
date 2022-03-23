package exceptions;

public class ProjectContributersException extends Exception{

    public ProjectContributersException(String message) {
        super(message);
        System.out.println("CONTRIBUTERS EXCEPTION: " + message);
    }
}
