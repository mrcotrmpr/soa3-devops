package Backlog;

public class BacklogItem {

    public String description;
    public int value;
    public int estimate;
    public int priority;

    public IBacklogItemState state;

    public BacklogItem(String description, int value, int estimate, int priority) {
        this.description = description;
        this.value = value;
        this.estimate = estimate;
        this.priority = priority;
        this.state = new ToDoState(this);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getEstimate() {
        return estimate;
    }

    public void setEstimate(int estimate) {
        this.estimate = estimate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public IBacklogItemState getState() {
        return state;
    }

    public void setState(IBacklogItemState state) {
        this.state = state;
    }
    public Class<? extends IBacklogItemState> getCurrentState(){
        return this.state.getClass();
    }
}
