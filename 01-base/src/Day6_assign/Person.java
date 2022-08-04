package Day6_assign;

import java.util.Scanner;

public class Person{
	
	//fields
	private String name;
	private String nrcno;
	private String address;
	private String phone;	
	
	//constructor
	public Person(String name, String nrcno, String address, String phone) {
		super();
		this.name = name;
		this.nrcno = nrcno;
		this.address = address;
		this.phone = phone;
	}

	//getter/setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNrcno() {
		return nrcno;
	}

	public void setNrcno(String nrcno) {
		this.nrcno = nrcno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	//showInfo
	public void ShowInfo() {
		System.out.println("Name: " + name);
		System.out.println("NRC NO: " + nrcno);
		System.out.println("Address: " + address);
		System.out.println("Phone: " + phone);
	}
	
	//showIdIno
	public void ShowIdInfo() {
		String[] division = {"Kachin","Kayar","Kayin","Chin","Sagaing","Tanintharyi","Bago","Magway","Mandalay","Mon","Rakhine","Yangon","Shan","Ayeyawady"};
		
		int index = Integer.parseInt(nrcno.substring(0,nrcno.indexOf("/")));
		String city = nrcno.substring(nrcno.indexOf("/") + 1,nrcno.indexOf("("));
		String No = nrcno.substring(nrcno.indexOf(")") + 1);
		
		System.out.println("Divisoin/State: " + division[index-1]);
		System.out.println("City: " + city);
		System.out.println("Number: " + No);
	}
}

class Teacher extends Person{

	//fields
	private String position;
	private String department;
	private Integer salary;
	
	//constructor
	public Teacher(String name, String nrcno, String address, String phone, String position, String department, Integer salary) {
		super(name, nrcno, address, phone);
		this.position = position;
		this.department = department;
		this.salary = salary;
	}

	//get/set
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	//promote
	public void promote(String position,Integer salary) {
		
	}
	//promote
	public void showTeacherInfo() {
		ShowInfo();
		System.out.println();
		ShowIdInfo();
		
		System.out.println("\nPosition : " + getPosition());
		System.out.println("Department : " + getDepartment());
		System.out.println("Salary : " + getSalary());
		
//		System.out.println("\nUpdate Position : " + getPosA("Assistant") + "\tSalary : " + getSalaryA("500000"));
//		System.out.println("Department : " + getDepartment());
	}
	
	//transfer
	public void transfer() {
		System.out.print("Enter department u want to transfer: ");
		Scanner sc = new Scanner(System.in);
		String new_department = sc.nextLine();
		System.out.println("Department : " + new_department);
	}
	
	public void showTeacherInfo2(){
		ShowInfo();
		System.out.println();
		ShowIdInfo();
		
		System.out.println("\nPosition : " + getPosition());
		System.out.println("Department : " + getDepartment());
		System.out.println("Salary : " + getSalary());
		
//		System.out.println("\nUpdate Position : " + getPosA("Lab") + "\tSalary : " + getSalaryA("300000"));
		transfer();
	}
}