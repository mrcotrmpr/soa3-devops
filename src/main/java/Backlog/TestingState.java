package Backlog;

import exceptions.ChangeBacklogStateException;

public class TestingState implements IBacklogItemState {

    public Backlog context;

    public TestingState(Backlog context) {
        this.context = context;
    }

    @Override
    public void changeToToDoState() {
        this.context.setState(new ToDoState(this.context));
    }

    @Override
    public void changeToDoingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Testing to Doing!");
    }

    @Override
    public void changeToReadyForTestingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Testing to ReadyForTesting!");
    }

    @Override
    public void changeToTestingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Testing to Testing");
    }

    @Override
    public void changeToTestedState() {
        this.context.setState(new TestedState(this.context));
    }

    @Override
    public void changeToDoneState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Testing to Done!");
    }
}
