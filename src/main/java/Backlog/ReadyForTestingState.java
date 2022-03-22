package Backlog;

import exceptions.ChangeBacklogStateException;

public class ReadyForTestingState implements IBacklogItemState {


    public Backlog context;

    public ReadyForTestingState(Backlog context) {
        this.context = context;
    }

    @Override
    public void changeToToDoState()  {
        //TODO: F20 Als scrum master wil ik een notificatie krijgen als een backlog item van Ready for testing naar Todo wordt verplaatst zodat ik hiernaar kan handelen
        this.context.setState(new ToDoState(this.context));
    }

    @Override
    public void changeToDoingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from ReadyForTesting to Doing!");

    }

    @Override
    public void changeToReadyForTestingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from ReadyForTesting to ReadyForTesting!");

    }

    @Override
    public void changeToTestingState() {
        this.context.setState(new TestingState(this.context));
    }

    @Override
    public void changeToTestedState() {
            this.context.setState(new TestedState(this.context));
    }

    @Override
    public void changeToDoneState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from ReadyForTesting to Done!");

    }
}
