package Backlog;

import Account.Account;
import exceptions.ChangeBacklogStateException;

public class ToDoState implements IBacklogItemState {

    private BacklogItem _backlogItem;

    public ToDoState(BacklogItem context) {
        this._backlogItem = context;
    }

    @Override
    public void changeToToDoState() throws ChangeBacklogStateException {
        ErrorHandler.throwChangeStateError("Can't change from ToDo to ToDo");
    }

    @Override
    public void changeToDoingState() {
        _backlogItem.setState(new DoingState(this._backlogItem));
    }

    @Override
    public void changeToReadyForTestingState(Account account) throws ChangeBacklogStateException {
        ErrorHandler.throwChangeStateError("CCan't change from ToDo to ReadyForTesting!");
    }

    @Override
    public void changeToTestingState() throws ChangeBacklogStateException {
        ErrorHandler.throwChangeStateError("Can't change from ToDo to Testing!");
        throw new ChangeBacklogStateException("Can't change from ToDo to Testing!");
    }

    @Override
    public void changeToTestedState() throws ChangeBacklogStateException {
        ErrorHandler.throwChangeStateError("Can't change from ToDo to Tested!");
    }

    @Override
    public void changeToDoneState() throws ChangeBacklogStateException {
        ErrorHandler.throwChangeStateError("Can't change from ToDo to ReadyForTesting!");
    }
}
