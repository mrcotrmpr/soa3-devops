package backlog;

import account.Account;
import exceptions.ChangeBacklogStateException;

public class DoneState implements IBacklogItemState {

    private final BacklogItem backlogItem;

    public DoneState(BacklogItem context) {
        this.backlogItem = context;
    }

    private void throwException(String msg) throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException(msg);
    }

    @Override
    public void changeToToDoState() {
        this.backlogItem.getThread().setActive(true);
        this.backlogItem.setState(new ToDoState(this.backlogItem));
    }

    @Override
    public void changeToDoingState() throws ChangeBacklogStateException {
        throwException("Can't change from Done to Doing!");
    }

    @Override
    public void changeToReadyForTestingState(Account account) throws ChangeBacklogStateException {
        throwException("Can't change from Done to ReadyForTesting!");
    }

    @Override
    public void changeToTestingState() throws ChangeBacklogStateException {
        throwException("Can't change from Done to Testing!");
    }

    @Override
    public void changeToTestedState() throws ChangeBacklogStateException {
        throwException("Can't change from Done to Tested!");
    }

    @Override
    public void changeToDoneState() throws ChangeBacklogStateException {
        throwException("Can't change from Done to Done!");
    }
}
