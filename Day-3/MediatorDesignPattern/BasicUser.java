package MediatorDesignPattern;

public class BasicUser implements IUser {
	private IChatMediator mediator;
	private String name;

	public BasicUser(IChatMediator mediator, String name) {
		super();
		this.mediator = mediator;
		this.name = name;
	}

	@Override
	public void sendMessage(String message) {
		mediator.sendMessage(message, this);
	}

	@Override
	public void receiveMessage(String message) {
		System.out.println(name+" recieved the message "+message);
	}

}
