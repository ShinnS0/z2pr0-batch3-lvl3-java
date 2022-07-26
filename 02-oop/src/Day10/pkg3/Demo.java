package Day10.pkg3;

public class Demo {

	public static void main(String[] args) {
		Person p = new Person("James");
		p.showData();
		
		Teacher t = new Teacher("John","Tutor");
		t.showData();
		
		Person p2 = new Teacher("Cheery","Professor");
		p2.showData();//call Teacher's method
	}
}
