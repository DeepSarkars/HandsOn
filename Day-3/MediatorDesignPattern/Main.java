package MediatorDesignPattern;

public class Main {
	public static void main(String[] args) {
		ChatMediator chatMediator = new ChatMediator();
		
		IUser basicUser = new BasicUser(chatMediator, "Mr.A");
		IUser premiumUser = new PremiumUser(chatMediator, "Mr.B");
		
		chatMediator.addUser(basicUser);
		chatMediator.addUser(premiumUser);
		chatMediator.addUser(new BasicUser(chatMediator, "Mr.X"));
		chatMediator.addUser(new PremiumUser(chatMediator, "Mr.Y"));
		
		premiumUser.sendMessage("Hi there");
	}
}
