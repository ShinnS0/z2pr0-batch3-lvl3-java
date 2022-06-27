package Day2;

public class TypeCasting {
	public static void main(String[] args) {
		
		//Implicit Casting
		int a = 200;
		long b = a;
		double c = b;
		
		System.out.println(  "a = " + a);
		System.out.println(  "b = " + b);
		System.out.println(  "c = " + c);
		
		//Explicit casting
		System.out.println("____________________");
		double d = 5.7;
		int e = (int)d;
		
		System.out.println(  "d = " + d);
		System.out.println(  "e = " + e);
	}
}
