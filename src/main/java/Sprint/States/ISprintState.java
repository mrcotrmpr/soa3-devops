package Sprint.States;

import exceptions.ChangeSprintStateException;

public interface ISprintState {
    void changeToInitialState() throws ChangeSprintStateException;
    void changeToInProgressState() throws ChangeSprintStateException;
    void changeToFinishedState() throws ChangeSprintStateException;
}
