import Notification.*;
import PipeLine.PipeLineManager;

class main {
    public static void main(String[] args) {

        // Test Notification
        PipeLineManager pipeLineManager = new PipeLineManager();
        INotifier notifier = new SlackNotify();

        Subscriber s = new NotificationService(notifier, pipeLineManager);
        pipeLineManager.subscribe(s);

        pipeLineManager.notifySubscribers();

    }
}