package Backlog;

import exceptions.ChangeBacklogStateException;

public class ToDoState implements IBacklogItemState {

    public Backlog context;

    public ToDoState(Backlog context) {
        this.context = context;
    }

    @Override
    public void changeToToDoState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from ToDo to ToDo");
    }

    @Override
    public void changeToDoingState() {
        context.setState(new DoingState(this.context));
    }

    @Override
    public void changeToReadyForTestingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from ToDo to ReadyForTesting!");
    }

    @Override
    public void changeToTestingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from ToDo to Testing!");
    }

    @Override
    public void changeToTestedState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from ToDo to Tested!");
    }

    @Override
    public void changeToDoneState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from ToDo to ReadyForTesting!");
    }
}
