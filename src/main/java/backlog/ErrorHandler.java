package backlog;

import exceptions.ChangeBacklogStateException;

public class ErrorHandler {
    public static void throwChangeStateError(String msg) throws ChangeBacklogStateException {
        throw new ChangeBacklogStateException("msg");
    }

}
