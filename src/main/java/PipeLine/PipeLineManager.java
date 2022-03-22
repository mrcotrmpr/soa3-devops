package PipeLine;

import Notification.Publisher;
import Notification.Subscriber;

import java.util.ArrayList;

public class PipeLineManager implements Publisher {

    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber s) {
        this.subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        this.subscribers.remove(s);
    }

    public void notifySubscribers() {
        for(Subscriber s : subscribers){
            s.update();
        }
    }
}
