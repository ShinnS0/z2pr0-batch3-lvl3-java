package Day10;

public class Students extends Person{
	
	private int rno;
	//rno = 1 , name = "aung2" phone = "09********"
	public Students(int rno, String name, String phone) {
		super(name, phone); //super
		this.rno = rno;//obj.rno = 1
	}

	public int getRno() {
		return rno;
	}
	
	public void setRno(int rno) {
		this.rno = rno;
	}
	
}
