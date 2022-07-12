package Day8;

public class Employee {

	static int noOfEmployee = 3;//static field
	static int nextId = 1;//static field
	final int empId;//final
	String name;//instance
	int salary;//instance
	
	static final float BONUS = 2.5f;//const var
	
	//constructor
	public Employee()throws AppException {
		if(nextId > noOfEmployee) 
			throw new AppException("Sorry! Limited number has been reached!");
		
		empId = nextId;
		nextId++;
	}
	
	public void initData(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public void changeData(String new_name,int new_salary) {//Aung ,300000
		if(! name.equalsIgnoreCase(new_name))
			this.name= new_name;
		if(salary != new_salary)
			this.salary = new_salary;
	}
	
	public void showData() {
		System.out.println(empId + "\t" + name + "\t" + salary + "ks");
	}
	
	public static void changeNoOfEmployee(int no) {
		noOfEmployee = no;//static can't use "this" keyword
//		salary =1000; cam't use
//		this.nmae="";
	}
	public void viewInFormation() {
		System.out.println("Total emp: " + noOfEmployee);//can access static
		System.out.println("\n----- Current employee info -----");
		this.showData();//access instance method
		System.out.println("Next employee's ID: " + nextId);
	}
	
}
