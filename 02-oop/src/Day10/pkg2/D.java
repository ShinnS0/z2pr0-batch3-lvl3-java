package Day10.pkg2;

import Day10.pkg1.A;

public class D {

	void test() {
		var obj = new A();
//		obj.number = 300;  // error Different package
//		obj.name = "cheery"; error (non-subclass)
		obj.age = 22; // public access
	}
}
