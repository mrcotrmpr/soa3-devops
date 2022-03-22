package Backlog;

public class ToDoState implements IBacklogItemState {

    public Backlog context;

    public ToDoState(Backlog context) {
        this.context = context;
    }

    @Override
    public void changeToDoingState() {

    }

    @Override
    public void changeToReadyForTestingState() {

    }

    @Override
    public void changeToTestingState() {

    }

    @Override
    public void changeToTestedState() {

    }

    @Override
    public void changeToDoneState() {

    }
}
