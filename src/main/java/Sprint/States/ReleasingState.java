package Sprint.States;

import Sprint.Sprint;
import exceptions.ChangeSprintStateException;

public class ReleasingState implements ISprintState {

    private Sprint sprint;

    public ReleasingState(Sprint sprint) {
        this.sprint = sprint;
    }

    @Override
    public void changeToInitialState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException("Can't change state while releasing!");
    }

    @Override
    public void changeToInProgressState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException("Can't change state while releasing!");
    }

    @Override
    public void changeToFinishedState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException("Can't change state while releasing!");
    }

    @Override
    public void changeToReleasingState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException("Can't change state while releasing!");
    }

    @Override
    public void changeToReleaseCancelledState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException("Can't change state while releasing!");
    }

    @Override
    public void changeToReleaseErrorState() throws InterruptedException {
        this.sprint.pipeLineManager.executePipeLineByName(this.sprint.getPipeline().getPipeLineName());
        this.sprint.setState(new ReleaseErrorState(this.sprint));
    }

    @Override
    public void changeToReleaseSuccessState() throws InterruptedException {
        this.sprint.pipeLineManager.executePipeLineByName(this.sprint.getPipeline().getPipeLineName());
        this.sprint.setState(new ReleaseSuccessState(this.sprint));
    }

    @Override
    public void changeToReviewedState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException("Can't change state while releasing!");
    }
}
