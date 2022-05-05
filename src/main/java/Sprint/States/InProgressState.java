package Sprint.States;

import Sprint.Sprint;
import exceptions.ChangeSprintStateException;

public class InProgressState implements ISprintState {

    private Sprint sprint;

    public InProgressState(Sprint sprint) {
        this.sprint = sprint;
    }

    @Override
    public void changeToInitialState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException("Can't change from in progress to inital!");
    }

    @Override
    public void changeToInProgressState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException("Can't change from in progress to in progress!");
    }

    @Override
    public void changeToFinishedState() {
        this.sprint.setState(new FinishedState(this.sprint));
    }
}
