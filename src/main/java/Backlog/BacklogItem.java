package Backlog;

public class BacklogItem {

    public IBacklogItemState state;

    public BacklogItem() {
        this.state = new ToDoState(this);
    }

    public IBacklogItemState getState() {
        return state;
    }

    public void setState(IBacklogItemState state) {
        this.state = state;
    }
}
