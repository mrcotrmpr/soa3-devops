package Backlog;

import exceptions.ChangeBacklogStateException;

public interface IBacklogItemState {
    void changeToToDoState() throws ChangeBacklogStateException;
    void changeToDoingState();
    void changeToReadyForTestingState() throws ChangeBacklogStateException;
    void changeToTestingState() throws ChangeBacklogStateException;
    void changeToTestedState() throws ChangeBacklogStateException;
    void changeToDoneState() throws ChangeBacklogStateException;

}
