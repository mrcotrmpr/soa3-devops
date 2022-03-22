package Backlog;

public class Backlog {

    public IBacklogItemState state;

    public Backlog() {
        this.state = new ToDoState(this);
    }
}
