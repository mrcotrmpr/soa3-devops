package backlog;

import account.Account;
import exceptions.ChangeBacklogStateException;

public class TestingState implements IBacklogItemState {

    private BacklogItem backlogItem;

    public TestingState(BacklogItem context) {
        this.backlogItem = context;
    }

    private void throwException(String msg) throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException(msg);
    }

    @Override
    public void changeToToDoState() {
        this.backlogItem.setState(new ToDoState(this.backlogItem));
    }

    @Override
    public void changeToDoingState() throws ChangeBacklogStateException {
        throwException("Can't change from Testing to Doing!");
    }

    @Override
    public void changeToReadyForTestingState(Account account) throws ChangeBacklogStateException {
        throwException("Can't change from Testing to ReadyForTesting!");
    }

    @Override
    public void changeToTestingState() throws ChangeBacklogStateException {
        throwException("Can't change from Testing to Testing");
    }

    @Override
    public void changeToTestedState() {
        this.backlogItem.setState(new TestedState(this.backlogItem));
    }

    @Override
    public void changeToDoneState() throws ChangeBacklogStateException {
        throwException("Can't change from Testing to Done!");
    }
}
