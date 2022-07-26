package Day12;

public interface InterFaceTesting {
	
	void abstractMethod();
	
	default void defaultMethod() {
		System.out.println("This is default method.");
	}
	
	static void staticMethod() {
		System.out.println("This is static method");
	}
	
	private void privateMethod() {
		System.out.println("This is private method");
	}
	
}

class MyClass implements InterFaceTesting{

	@Override
	public void abstractMethod() {
		System.out.println("This is abstract Method");
		
	}
	
	@Override
	public void defaultMethod() {
		System.out.println("Default method can be overriden");
	}
	
//	@Override
//	public 
	
}
