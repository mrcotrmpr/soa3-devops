package Backlog;

import Account.Account;
import exceptions.ChangeBacklogStateException;

public class TestingState implements IBacklogItemState {

    private BacklogItem _backlogItem;

    public TestingState(BacklogItem context) {
        this._backlogItem = context;
    }

    @Override
    public void changeToToDoState() {
        this._backlogItem.setState(new ToDoState(this._backlogItem));
    }

    @Override
    public void changeToDoingState() throws ChangeBacklogStateException {
        ErrorHandler.throwChangeStateError("Can't change from Testing to Doing!");
    }

    @Override
    public void changeToReadyForTestingState(Account account) throws ChangeBacklogStateException {
        ErrorHandler.throwChangeStateError("Can't change from Testing to ReadyForTesting!");
    }

    @Override
    public void changeToTestingState() throws ChangeBacklogStateException {
        ErrorHandler.throwChangeStateError("Can't change from Testing to Testing");
    }

    @Override
    public void changeToTestedState() {
        this._backlogItem.setState(new TestedState(this._backlogItem));
    }

    @Override
    public void changeToDoneState() throws ChangeBacklogStateException {
        ErrorHandler.throwChangeStateError("Can't change from Testing to Done!");
    }
}
