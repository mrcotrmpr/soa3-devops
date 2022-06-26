package sprint.states;

import sprint.Sprint;
import exceptions.ChangeSprintStateException;

public class ReleaseCancelledState implements ISprintState {

    private final static String CANCELLED = "Release cancelled is a final state!";

    public ReleaseCancelledState(Sprint sprint) {
    }

    @Override
    public void changeToInitialState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(CANCELLED);
    }

    @Override
    public void changeToInProgressState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(CANCELLED);
    }

    @Override
    public void changeToFinishedState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(CANCELLED);
    }

    @Override
    public void changeToReleasingState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(CANCELLED);
    }

    @Override
    public void changeToReleaseCancelledState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(CANCELLED);
    }

    @Override
    public void changeToReleaseErrorState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(CANCELLED);
    }

    @Override
    public void changeToReleaseSuccessState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(CANCELLED);
    }

    @Override
    public void changeToReviewedState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(CANCELLED);
    }
}
