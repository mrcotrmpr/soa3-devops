package Notification;

public class MailNotify implements INotifier{

    public MailLib adaptor;

    public MailNotify(){
        this.adaptor = new MailLib();
    }

    public void sendNotification() {
        adaptor.sendMail();
    }
}
