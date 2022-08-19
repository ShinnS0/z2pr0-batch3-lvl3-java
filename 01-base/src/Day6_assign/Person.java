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
	
	private String new_pos;
	private String new_department;
	private String new_salary;
	
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
	
	public String getPositionA(String new_pos) {
		return new_pos;
	}
	
	public String getDepartmentA(String new_department) {
		return new_department;
	}
	
	public String getSalaryA(String new_salary) {
		return new_salary;
	}
	
	//promote
	public void showTeacherInfo() {
		ShowInfo();
		System.out.println();
		ShowIdInfo();
		
		System.out.println("\nPosition : " + getPosition());
		System.out.println("Department : " + getDepartment());
		System.out.println("Salary : " + getSalary());
	}
	
	//transfer
	public void transfer() {
		System.out.print("Enter department u want to transfer: ");
		Scanner sc = new Scanner(System.in);
		new_department = sc.nextLine();
		
		System.out.println("\nUpdate data!");
//		ShowInfo();
		System.out.println("Position : " + getPositionA(new_pos));
		System.out.println("Department : " + getDepartmentA(new_department));
		System.out.println("Salary : " + getSalaryA(new_salary));
	}
	
	//promote
	public void promote(){
		System.out.print("Enter position u want to promote: ");
		Scanner sc = new Scanner(System.in);
		new_pos = sc.nextLine();
		System.out.print("Enter salary u want to rise: ");
		Scanner sc1 = new Scanner(System.in);
		new_salary = sc1.nextLine();
		
		System.out.println("\nUpdate data!");
//		ShowInfo();
		System.out.println("Position : " + getPositionA(new_pos));
		System.out.println("Department : " + getDepartment());
		System.out.println("Salary : " + getSalaryA(new_salary));
		
	}
	//show latetest update DATA
	public void show_latest_data() {
		ShowInfo();
		System.out.println("\nPosition : " + getPositionA(new_pos));
		System.out.println("Department : " + getDepartmentA(new_department));
		System.out.println("Salary : " + getSalaryA(new_salary));
	}
	
	//forward
	public void forward() {
		System.out.println("1.Show teacher Info\n2.Promote\n3.Transfer\n4.Show latest update data\n5.Exit");
		System.out.print("Enter option No: ");
		Scanner sc = new Scanner(System.in);
		var fw = sc.nextInt();
		
		if(fw == 1) {
			showTeacherInfo();
			System.out.println("----------------");
			forward();
		}else if(fw == 2) {
			promote();
			System.out.println("----------------");
			forward();
		}else if(fw == 3) {
			transfer();
			System.out.println("----------------");
			forward();
		}else if(fw == 4) {
			show_latest_data();
//			forward();
		}else if(fw == 5){
			System.out.println("Have a great day!");
		}else {
			System.err.println("There is no option No " + fw);
		}
	}
}