import java.util.ArrayList;
import java.util.List;


public class NewsAgency {
    private List<Subscriber> subscribers;

    public NewsAgency() {
        subscribers = new ArrayList<>();
    }


    public void subscribe(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        }
    }


    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }


    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }


    public void publishNews(String news) {
        System.out.println("News published: " + news);
        notifySubscribers(news);
    }
}

