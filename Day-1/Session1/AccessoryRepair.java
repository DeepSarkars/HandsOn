package Session1;

public class AccessoryRepair implements AccessoryRepairInterface {
	@Override
	public void RepairAccessory(String accessoryType) {
		System.out.println(accessoryType + " accessory repair accepted.");
	}
}