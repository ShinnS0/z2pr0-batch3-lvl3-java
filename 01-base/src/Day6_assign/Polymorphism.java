package Day6_assign;


public class Polymorphism {

	public static void main(String[] args) {
		
		shape_1[] data = new shape_1[2];
		
		data[0] = new Cube();
		data[1] = new Circle();
		
		for(var i=0;i<2;i++) {
			data[i].Area();
			data[i].Volume();
		}
	}
}