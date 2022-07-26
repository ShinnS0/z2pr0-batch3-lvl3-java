package Day12;

public class Fly_Demo {

	public static void main(String[] args) {
		
		Flying[] data = new Flying[3];
		
		data[0] = new Bird();
		data[1] = new Human();
		data[2] = new AirPlane();
		
		for(var i =0; i<data.length; i++) {
			data[i].fly();
		}
		
//		Flying a = new Bird();
		
	}
}
