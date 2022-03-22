package Backlog;

public class ReadyForTestingState implements IBacklogItemState {


    public Backlog context;

    public ReadyForTestingState(Backlog context) {
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
