package backlog;

import account.Account;
import exceptions.ChangeBacklogStateException;

public class DoingState implements IBacklogItemState {

    private BacklogItem backlogItem;

    public DoingState(BacklogItem context) {
        this.backlogItem = context;
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
    public void changeToReadyForTestingState(Account account) {
        this.backlogItem.setState(new ReadyForTestingState(this.backlogItem));

        this.backlogItem.notifySpecificSubscribers("Tester", "Backlog item changed from doing to ready for testing");

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
