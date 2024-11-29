public class Main {
    public static void main(String[] args) {

        NewsAgency newsAgency = new NewsAgency();


        Subscriber subscriber1 = new ConcreteSubscriber("Alice");
        Subscriber subscriber2 = new ConcreteSubscriber("Bob");
        Subscriber subscriber3 = new ConcreteSubscriber("Charlie");


        SubscriptionManager subscriptionManager = new SubscriptionManager(newsAgency);


        subscriptionManager.addSubscription(subscriber1);
        subscriptionManager.addSubscription(subscriber2);


        newsAgency.publishNews("Breaking: Stock prices soar!");


        subscriptionManager.removeSubscription(subscriber2);
        subscriptionManager.addSubscription(subscriber3);


        newsAgency.publishNews("Breaking: New tech gadget released!");
    }
}
