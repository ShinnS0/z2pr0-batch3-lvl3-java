package Day15;

import java.util.HashMap;
import java.util.Map;

public class Map_with_userObject {
	
	public static void main(String[] args) {
		
		var employees = new HashMap<Integer, Employee>();
//		Map<Integer, Employee> employees = new HashMap<>();

		Employee emp = new Employee(1001,"Aung Aung","Yangon");
		
		employees.put(1001,emp);
		employees.put(1002, new Employee(1002,"Cherry","Pyin oo lwin"));
		employees.put(1003, new Employee(1002,"Hnin","Yangon"));
		
		System.out.println(employees);
		
		//for each
		employees.forEach((k,obj) ->{
			System.out.println("Id: " + obj.getId());
			System.out.println("Name: " + obj.getName());
			System.out.println("City: " + obj.getCity());
			System.out.println("-----------------");
		});
		
		Employee obj = employees.get(1001);
		System.out.println("Obj: " + obj);
		
		System.out.println("----- Employees in Yangom -----");
		employees.forEach((k,val)->{
			if(val.getCity().toLowerCase().equals("yangon"));
				System.out.println(val);
		});
	}
}

class Employee{
	
	private int id;
	private String name;
	private String city;
	
	public Employee(int i, String string, String string2) {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
}