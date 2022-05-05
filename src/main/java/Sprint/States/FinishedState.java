package Sprint.States;

import Sprint.Sprint;
import exceptions.ChangeSprintStateException;

public class FinishedState implements ISprintState {

    private Sprint sprint;

    public FinishedState(Sprint sprint) {
        this.sprint = sprint;
    }

    @Override
    public void changeToInitialState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException("Can't change from finished to inital!");
    }

    @Override
    public void changeToInProgressState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException("Can't change from finished to inital!");
    }

    @Override
    public void changeToFinishedState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException("Can't change from finished to finished!");
    }
}
