package Backlog;

import Account.Account;
import exceptions.ChangeBacklogStateException;

public class DoingState implements IBacklogItemState {

    private BacklogItem _backlogItem;

    public DoingState(BacklogItem context) {
        this._backlogItem = context;
    }

    @Override
    public void changeToToDoState() throws ChangeBacklogStateException {
        ErrorHandler.throwChangeStateError("Can't change from Doing to ToDo!");

    }

    @Override
    public void changeToDoingState() throws ChangeBacklogStateException {
        ErrorHandler.throwChangeStateError("Can't change from Doing to Doing!");
    }

    @Override
    public void changeToReadyForTestingState(Account account) {
        this._backlogItem.setState(new ReadyForTestingState(this._backlogItem));

        this._backlogItem.notifySpecificSubscribers("Tester", "Backlog item changed from doing to ready for testing");

    }

    @Override
    public void changeToTestingState() throws ChangeBacklogStateException {
        ErrorHandler.throwChangeStateError("Can't change form Doing to Testing!");
    }

    @Override
    public void changeToTestedState() throws ChangeBacklogStateException {
        ErrorHandler.throwChangeStateError("Can't change form Doing to Tested!");
    }

    @Override
    public void changeToDoneState() throws ChangeBacklogStateException {
        ErrorHandler.throwChangeStateError("Can't change form Doing to Done!");
    }
}
