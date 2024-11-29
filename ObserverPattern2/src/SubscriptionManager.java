
public class SubscriptionManager {
    private NewsAgency newsAgency;

    public SubscriptionManager(NewsAgency newsAgency) {
        this.newsAgency = newsAgency;
    }


    public void addSubscription(Subscriber subscriber) {
        newsAgency.subscribe(subscriber);
    }


    public void removeSubscription(Subscriber subscriber) {
        newsAgency.unsubscribe(subscriber);
    }


    public void modifySubscription(Subscriber oldSubscriber, Subscriber newSubscriber) {
        newsAgency.unsubscribe(oldSubscriber);
        newsAgency.subscribe(newSubscriber);
    }
}

