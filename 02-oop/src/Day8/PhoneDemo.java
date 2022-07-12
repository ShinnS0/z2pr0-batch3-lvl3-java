package Day8;

public class PhoneDemo {

	public static void main(String[] args) {
		
		//creating object
		Phone phone1 = new Phone("Iphone", "black", 1500000);
		Phone phone2 = new Phone("Samsung", "white",800000);
		Phone phone3 = new Phone("Vivo","gray",500000);
		
		System.out.println("------ Phone1's info ------\n");
		System.out.println("Brand: " + phone1.brand);
		System.out.println("Color: " + phone1.color);
		System.out.println("Price: " + phone1.price + " ks.");
		
		phone1.call();
		phone1.sendSms();
		
		//Phone2
		System.out.println("------ Phone2's info ------\n");
		System.out.println("Brand: " + phone2.brand);
		System.out.println("Color: " + phone2.color);
		System.out.println("Price: " + phone2.price + " ks.");
		
		phone2.call();
		phone2.sendSms();
		
		//Phone3
		System.out.println("------ Phone3's info ------\n");
		System.out.println("Brand: " + phone3.brand);
		System.out.println("Color: " + phone3.color);
		System.out.println("Price: " + phone3.price + " ks.");
		
		phone3.call();
		phone3.sendSms();
		
		phone1.shop = "ABC";
		System.out.println("Phone2's Shop name: " + phone2.shop);
		
	}
}
