package Sprint.States;

import Sprint.Sprint;
import exceptions.ChangeSprintStateException;

public class InitialState implements ISprintState {

    private Sprint sprint;

    public InitialState(Sprint sprint) {
        this.sprint = sprint;
    }

    @Override
    public void changeToInitialState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException("Can't change from Initial to inital!");
    }

    @Override
    public void changeToInProgressState() {
        this.sprint.setState(new InProgressState(this.sprint));
    }

    @Override
    public void changeToFinishedState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException("Can't change from Initial to Finished!");
    }

}
