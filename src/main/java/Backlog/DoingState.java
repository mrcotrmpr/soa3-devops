package Backlog;

import exceptions.ChangeBacklogStateException;

public class DoingState implements IBacklogItemState {

    public Backlog context;

    public DoingState(Backlog context) {
        this.context = context;
    }

    @Override
    public void changeToToDoState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Doing to ToDo!");
    }

    @Override
    public void changeToDoingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Doing to Doing!");
    }

    @Override
    public void changeToReadyForTestingState() {
        //TODO: F13 Als tester wil ik een notificatie krijgen als een backlog item in de fase Ready for testing komt zodat ik weet wanneer ik moet gaan testen
        this.context.setState(new ReadyForTestingState(this.context));

    }

    @Override
    public void changeToTestingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change form Doing to Testing!");
    }

    @Override
    public void changeToTestedState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change form Doing to Tested!");

    }

    @Override
    public void changeToDoneState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change form Doing to Done!");
    }
}
