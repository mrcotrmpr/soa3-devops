package Backlog;

import Exceptions.ChangeBacklogStateException;

public interface IBacklogItemState {
    void changeToToDoState() throws ChangeBacklogStateException;
    void changeToDoingState() throws ChangeBacklogStateException;
    void changeToReadyForTestingState() throws ChangeBacklogStateException;
    void changeToTestingState() throws ChangeBacklogStateException;
    void changeToTestedState() throws ChangeBacklogStateException;
    void changeToDoneState() throws ChangeBacklogStateException;

}
