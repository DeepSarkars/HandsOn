package ObserverPattern;

public class SubscriberTwo implements Observer {
	Publisher publisher;

	public SubscriberTwo(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}

	@Override
	public void update(Message m) {
		System.out.println("Subscriber two: "+m.getMessageString());
	}
}
