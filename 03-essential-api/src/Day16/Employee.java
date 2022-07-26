package Day16;

public class Employee {

	private String name;
	private int Salary;
	private String City;
	
	public Employee() {
		
	}

	public Employee(String name, int salary, String city) {
		super();
		this.name = name;
		Salary = salary;
		City = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", Salary=" + Salary + ", City=" + City + "]";
	}
	
	
}
