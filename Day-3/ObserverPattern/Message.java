package ObserverPattern;

public class Message {
	String messageString;
	
	public Message(String messageString) {
		this.messageString = messageString;
	}

	public String getMessageString() {
		return messageString;
	}

	public void setMessageString(String messageString) {
		this.messageString = messageString;
	}
}
