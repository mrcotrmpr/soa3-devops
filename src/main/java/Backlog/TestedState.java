package Backlog;

import exceptions.ChangeBacklogStateException;

public class TestedState implements IBacklogItemState {

    public Backlog context;

    public TestedState(Backlog context) {
        this.context = context;
    }

    @Override
    public void changeToToDoState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Tested to ToDo!");
    }

    @Override
    public void changeToDoingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Tested to Doing!");
    }

    @Override
    public void changeToReadyForTestingState() {
        //TODO: F13 Als tester wil ik een notificatie krijgen als een backlog item in de fase Ready for testing komt zodat ik weet wanneer ik moet gaan testen
        this.context.setState(new ReadyForTestingState(this.context));
    }

    @Override
    public void changeToTestingState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Tested to Testing!");
    }

    @Override
    public void changeToTestedState() throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("Can't change from Tested to Tested!");
    }

    @Override
    public void changeToDoneState() {
        //TODO: F9 Als gebruiker wil ik een backlog item pas de status 'Done' kunnen geven als alle taken zijn afgerond zodat deze taken niet over het hoofd worden gezien
        this.context.setState(new DoneState(this.context));
    }
}
