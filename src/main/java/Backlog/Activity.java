package Backlog;

public class Activity {

    public String description;
    public Boolean done;

    public Activity(String description) {
        this.description = description;
    }
    public void setDone(Boolean done) {
        this.done = done;
    }
    public Boolean getDone() {
        return done;
    }
    public String getDescription() {
        return description;
    }
}
