package Backlog;

public class Backlog {

    public IBacklogItemState state;

    public Backlog() {
        this.state = new ToDoState(this);
    }

    public IBacklogItemState getState() {
        return state;
    }

    public void setState(IBacklogItemState state) {
        this.state = state;
    }
}
