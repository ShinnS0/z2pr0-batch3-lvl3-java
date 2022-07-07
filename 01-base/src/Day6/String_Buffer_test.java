package Day6;

public class String_Buffer_test {
	
	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer("Java Programming");
		
		buffer.append(" Language");
		System.out.println("After append, buffer: " + buffer);
		
		buffer.insert(5, "is a ");
		System.out.println("After insert buffer: " + buffer);
		
		buffer.replace(0, 4, "PHP");
		System.out.println("After replace, buffer: " + buffer);
		
		System.out.println("Index of 'Language': " + buffer.indexOf("Language"));
		System.out.println("substring: " + buffer.substring(4));
		System.out.println("No of characters: " + buffer.length());
		
		int mark = 100;
		System.out.println("You gor " + mark + " marks");
		if(mark >= 50) {
			System.out.println("Exam fail");
		}
	
	}
}
