package backlog;

import account.Account;
import backlog.exceptions.ExceptionCreator;
import exceptions.ChangeBacklogStateException;

public class DoneState implements IBacklogItemState {

    private final BacklogItem backlogItem;

    public DoneState(BacklogItem context) {
        this.backlogItem = context;
    }
    private final ExceptionCreator exceptionCreator = new ExceptionCreator();

    @Override
    public void changeToToDoState() {
        this.backlogItem.getThread().setActive(true);
        this.backlogItem.setState(new ToDoState(this.backlogItem));
    }

    @Override
    public void changeToDoingState() throws ChangeBacklogStateException {
        exceptionCreator.throwException("Can't change from Done to Doing!");
    }

    @Override
    public void changeToReadyForTestingState(Account account) throws ChangeBacklogStateException {
        exceptionCreator.throwException("Can't change from Done to ReadyForTesting!");
    }

    @Override
    public void changeToTestingState() throws ChangeBacklogStateException {
        exceptionCreator.throwException("Can't change from Done to Testing!");
    }

    @Override
    public void changeToTestedState() throws ChangeBacklogStateException {
        exceptionCreator.throwException("Can't change from Done to Tested!");
    }

    @Override
    public void changeToDoneState() throws ChangeBacklogStateException {
        exceptionCreator.throwException("Can't change from Done to Done!");
    }
}
