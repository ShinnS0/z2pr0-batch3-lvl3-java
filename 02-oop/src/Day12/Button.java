package Day12;

public class Button implements OnClickListener{

	private String name;
	
	public Button(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Font- Size: " + FONT_SIZE);
		System.out.println("Font-family: "+ FONT_FAMILY);
		
	}
	
	@Override
	public void onClick() {
		System.out.println(name + " Click event");
		
	}

	@Override
	public void onDoubleClick() {
		
		
	}
	
}
