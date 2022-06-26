package scm;

import java.util.List;

public class Commit {

    private final int id;
    private final String message;
    private List<String> files;

    public Commit(int id, String message, List<String> files) {
        this.id = id;
        this.message = message;
        this.files = files;
    }

    public int getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public List<String> getFiles() {
        return files;
    }

}
