package backlog;

import account.Account;
import exceptions.ChangeBacklogStateException;

public class ReadyForTestingState implements IBacklogItemState {


    private BacklogItem backlogItem;

    public ReadyForTestingState(BacklogItem context) {
        this.backlogItem = context;
    }

    @Override
    public void changeToToDoState()  {
        this.backlogItem.setState(new ToDoState(this.backlogItem));
        this.backlogItem.notifySpecificSubscribers("ScrumMaster", "Change from ready to testing to doing");
    }

    @Override
    public void changeToDoingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from ReadyForTesting to Doing!");
    }

    @Override
    public void changeToReadyForTestingState(Account account) throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from ReadyForTesting to ReadyForTesting!");
    }

    @Override
    public void changeToTestingState() {
        this.backlogItem.setState(new TestingState(this.backlogItem));
    }

    @Override
    public void changeToTestedState() {
            this.backlogItem.setState(new TestedState(this.backlogItem));
    }

    @Override
    public void changeToDoneState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from ReadyForTesting to Done!");
    }
}
