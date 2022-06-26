package backlog.exceptions;

import exceptions.ChangeBacklogStateException;

public class ExceptionCreator {

    public void throwException(String msg) throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException(msg);
    }

}
