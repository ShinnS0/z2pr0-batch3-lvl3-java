package Day8;

public class Phone {
	
	//fields
	String brand;
	String color;
	int price;
	static String shop;
	
	//constructor
	public Phone(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	//method
	public void call() {
		System.out.println("Phone Calling can be made at here!");
	}
	
	public void sendSms () {
		System.out.println("Message can be send at here!\n");
	}
	
}
