package Day10;

public class Person{

	private String name;
	protected String phone;
	
	//name = aung2 phone = 09********
	public Person(String name, String phone) {
		super(); //super
		this.name = name;//obj.name
		this.phone = phone;//obj.phone
	}
	
	void display() {
		System.out.println("Name: " + name);
		System.out.println("Phone: " + phone);
	}
}
