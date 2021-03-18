package AdapterFactory;

public class Main {
	public static void main(String[] args) {
		Movable bugattiVeyron = new BugattiVeyron(); 
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		System.out.println("Bugatti Veyron price in USD");
		System.out.println(bugattiVeyron.getPrice());
		System.out.println("Bugatti Veyron price in EUR");
		System.out.println(bugattiVeyronAdapter.getPrice());
		
		System.out.println("Bugatti Veyron price in MPH");
		System.out.println(bugattiVeyron.getSpeed());
		System.out.println("Bugatti Veyron price in KMPH");
		System.out.println(bugattiVeyronAdapter.getSpeed());
	}
}
