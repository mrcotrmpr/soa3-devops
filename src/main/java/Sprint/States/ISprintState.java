package Sprint.States;

import exceptions.ChangeSprintStateException;

public interface ISprintState {
    void changeToInitialState() throws ChangeSprintStateException;
    void changeToInProgressState() throws ChangeSprintStateException;
    void changeToFinishedState() throws ChangeSprintStateException;
    void changeToReleasingState() throws ChangeSprintStateException;
    void changeToReleaseCancelledState() throws ChangeSprintStateException;
    void changeToReleaseErrorState() throws ChangeSprintStateException;
    void changeToReleaseSuccessState() throws ChangeSprintStateException;
    void changeToReviewedState() throws ChangeSprintStateException;
}
