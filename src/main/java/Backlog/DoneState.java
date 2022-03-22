package Backlog;

import exceptions.ChangeBacklogStateException;

public class DoneState implements IBacklogItemState {

    public Backlog context;

    public DoneState(Backlog context) {
        this.context = context;
    }

    @Override
    public void changeToToDoState() {
        this.context.setState(new ToDoState(this.context));
    }

    @Override
    public void changeToDoingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Done to Doing!");
    }

    @Override
    public void changeToReadyForTestingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Done to ReadyForTesting!");
    }

    @Override
    public void changeToTestingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Done to Testing!");
    }

    @Override
    public void changeToTestedState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Done to Tested!");
    }

    @Override
    public void changeToDoneState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Done to Done!");
    }
}
