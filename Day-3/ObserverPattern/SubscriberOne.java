package ObserverPattern;

public class SubscriberOne implements Observer {
	Publisher publisher;

	public SubscriberOne(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}

	@Override
	public void update(Message m) {
		System.out.println("Subscriber one: "+m.getMessageString());
	}
}
