package ObserverPattern;

public class SubscriberThree implements Observer {
	Publisher publisher;

	public SubscriberThree(Publisher publisher) {
		this.publisher = publisher;
		this.publisher.attach(this);
	}

	@Override
	public void update(Message m) {
		System.out.println("Subscriber three: "+m.getMessageString());
	}
}
