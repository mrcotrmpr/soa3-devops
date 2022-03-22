package Backlog;

public class TestedState implements IBacklogItemState {

    public Backlog context;

    public TestedState(Backlog context) {
        this.context = context;
    }

    @Override
    public void changeToToDoState() {

    }

    @Override
    public void changeToDoingState() {

    }

    @Override
    public void changeToReadyForTestingState() {

    }

    @Override
    public void changeToTestingState() {

    }

    @Override
    public void changeToTestedState() {

    }

    @Override
    public void changeToDoneState() {

    }
}
