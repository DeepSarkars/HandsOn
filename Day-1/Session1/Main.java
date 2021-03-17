package Session1;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome. Would you like to order or repair ?");
		String option = sc.nextLine().trim();
		if (option.equalsIgnoreCase("order")) {
			System.out.println("Provide phone's model name:");
			PhoneOrder po = new PhoneOrder();
			String phoneName = sc.nextLine();
			po.OrderPhone(phoneName);
		} else if (option.equalsIgnoreCase("repair")) {
			System.out.println("What do you want to repair phone or accessory?");
			option = sc.nextLine().trim();
			if (option.equalsIgnoreCase("phone")) {
				System.out.println("Provide phone's model name you want to repair:");
				String phoneName = sc.nextLine();
				PhoneRepair pr = new PhoneRepair();
				pr.RepairPhone(phoneName);
			} else if (option.equalsIgnoreCase("accessory")) {
				System.out.println("Provide accessory name you want to repair:");
				String accessoryName = sc.nextLine();
				AccessoryRepair ar = new AccessoryRepair();
				ar.RepairAccessory(accessoryName);
			} else {
				System.out.println("Invalid option selected");
			}
		} else {
			System.out.println("Invalid option selected");
		}
	}
}
