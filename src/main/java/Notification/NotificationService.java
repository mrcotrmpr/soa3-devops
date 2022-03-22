package Notification;


import PipeLine.PipeLineManager;

public class NotificationService implements Subscriber {

    public INotifier notifier;
    PipeLineManager pipeLineManager;

    public NotificationService(INotifier notifier, PipeLineManager pipeLineManager) {
        this.notifier = notifier;
        this.pipeLineManager = pipeLineManager;
    }

    public void sendNotification() {
        this.notifier.sendNotification();
    }

    public void update() {
        sendNotification();
    }

}
