package Notification;


import PipeLine.PipeLineManager;

public class NotificationService implements Subscriber {

    public INotifier notifier;

    public NotificationService(INotifier notifier) {
        this.notifier = notifier;
    }

    public void sendNotification() {
        this.notifier.sendNotification();
    }

    public void update() {
        sendNotification();
    }

}
