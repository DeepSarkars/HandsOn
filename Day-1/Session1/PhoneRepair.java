package Session1;

public class PhoneRepair implements PhoneRepairInterface {
	@Override
	public void RepairPhone(String modelName) {
		System.out.println(modelName + " repair accepted.");
	}

}