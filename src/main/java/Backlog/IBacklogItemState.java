package Backlog;

public interface IBacklogItemState {
    void changeToDoingState();
    void changeToReadyForTestingState();
    void changeToTestingState();
    void changeToTestedState();
    void changeToDoneState();

}
