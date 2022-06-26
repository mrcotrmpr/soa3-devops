package backlog;

import account.Account;
import account.LeadDeveloper;
import exceptions.ChangeBacklogStateException;

public class TestedState implements IBacklogItemState {

    private BacklogItem backlogItem;

    public TestedState(BacklogItem context) {
        this.backlogItem = context;
    }

    @Override
    public void changeToToDoState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Tested to ToDo!");
    }

    @Override
    public void changeToDoingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Tested to Doing!");
    }

    @Override
    public void changeToReadyForTestingState(Account account) throws ChangeBacklogStateException {
        if(PriviligeCheck.checkPrivilege(account, LeadDeveloper.class.toString())){
            this.backlogItem.setState(new ReadyForTestingState(this.backlogItem));
        }else{
            throw new ChangeBacklogStateException(account.getClass().toString()+" does not have permission to change back to ready for testing");
        }

    }

    @Override
    public void changeToTestingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Tested to Testing!");
    }

    @Override
    public void changeToTestedState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Tested to Tested!");
    }

    @Override
    public void changeToDoneState() throws ChangeBacklogStateException {
        if (this.backlogItem.activitiesDone()){
            this.backlogItem.getThread().setActive(false);
            this.backlogItem.setState(new DoneState(this.backlogItem));
        } else
        {
            throw new ChangeBacklogStateException("Can't change from Tested to Done because activities are not done!");
        }
    }
}
