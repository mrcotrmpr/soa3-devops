package sprint.states;

import sprint.Sprint;
import exceptions.ChangeSprintStateException;

public class ReviewedState implements ISprintState{

    private final static String REVIEWED = "Reviewed is a final state!";

    public ReviewedState(Sprint sprint) {
    }

    @Override
    public void changeToInitialState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(REVIEWED);
    }

    @Override
    public void changeToInProgressState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(REVIEWED);
    }

    @Override
    public void changeToFinishedState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(REVIEWED);
    }

    @Override
    public void changeToReleasingState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(REVIEWED);
    }

    @Override
    public void changeToReleaseCancelledState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(REVIEWED);
    }

    @Override
    public void changeToReleaseErrorState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(REVIEWED);
    }

    @Override
    public void changeToReleaseSuccessState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(REVIEWED);
    }

    @Override
    public void changeToReviewedState() throws ChangeSprintStateException {
        throw new ChangeSprintStateException(REVIEWED);
    }
}
