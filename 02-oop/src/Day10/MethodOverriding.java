package Day10;

public class MethodOverriding {
	
	public static void main(String[] args) {
		var cat = new Cat();
		cat.ShowData();//super method
		cat.sound();//child's
		cat.display();//child's
		
		System.out.println("-------------");
		Animal ani = new Animal();
		ani.sound();//animal's sound
		
		System.out.println("-------------");
		//
		ani = new Cat();
		ani.sound();//cat's sound
		
		Cat cat1 = new Cat();
		cat1.display();
		cat1.display("Shwe war");
		
	}
	
}
class Animal {
	
	void ShowData() {
		System.out.println("This is show method");
	}
	
	void sound() {//overridden method
		System.out.println("Some sound");
	}
	
}

class Cat extends Animal{
	void display() {
		System.out.println("Display 1");
	}
	void display(String name) {//overloading method
		System.out.println("Display 2");
	}
	@Override
	void sound() {//overriding method
		System.out.println("Myaung");
	}
}

