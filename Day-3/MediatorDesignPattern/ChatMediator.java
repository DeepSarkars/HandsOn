package MediatorDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {
	List<IUser> users = new ArrayList<>();

	@Override
	public void addUser(IUser user) {
		users.add(user);
	}

	@Override
	public void sendMessage(String message, IUser sender) {
		for (IUser itr : users) {
			if (itr != sender) {
				itr.receiveMessage(message);
			}
		}
	}

}
