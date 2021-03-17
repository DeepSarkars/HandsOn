package Session1;

public class PhoneOrder implements PhoneOrderInterface {
	@Override
	public void OrderPhone(String modelName) {
		System.out.println(modelName + " order accepted.");
	}
}