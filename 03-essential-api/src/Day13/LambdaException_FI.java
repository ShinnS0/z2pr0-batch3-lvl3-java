package Day13;

public class LambdaException_FI {
	
	public static void main(String[] args) {
		MyInterface1 inter1 = new MyClass();
		
		inter1.display("Aung Aung");
		
		MyInterface2 sub = new MyInterface2() {
			   
			   public int operate(int a, int b) {
			    // TODO Auto-generated method stub
			    return a - b;
			   }

			@Override
			public int addNumber(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}
			  };
	}
}

@FunctionalInterface
interface MyInterface1{
	void display(String name) ;
		
}

interface MyInterface2{
	int addNumber(int a, int b);
}

interface MyInterface3{
	boolean checkLogin(String uname, String upass);
}

class MyClass implements MyInterface1{

	@Override
	public void display(String name) {
		System.out.println("Name is " + name);
		
	}
	@FunctionalInterface
	interface MyInterface1 {
	 void display(String name);
	}

	interface MyInterface2 {
	 int operate(int a, int b);
	}

	interface MyInterface3 {
	 boolean checkLogin(String uname, String upass);
	}

	class Myclass implements MyInterface1 {

	 int i;
	 @Override
	 public void display(String name) {
	  System.out.println("Name is " + name);
	  
	 }
	 
	}
	
}