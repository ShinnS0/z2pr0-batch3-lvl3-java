package Day10.pkg3;

public class Teacher extends Person{

	private String position;
	
	public Teacher(String name, String pos) {
		super(name);
		this.position = pos;
	}
	
	@Override
	public void showData() {
		super.showData();
		System.out.println("Position: " + this.position);
		System.out.println("-----------------");
	}
}
