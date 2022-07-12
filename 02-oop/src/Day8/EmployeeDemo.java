package Day8;

public class EmployeeDemo {
	
	public static void main(String[] args) {
		
		try {
			//create object
			Employee emp1 = new Employee();
			Employee emp2 = new Employee();
			Employee emp3 = new Employee();
			
			//initialize Data
			emp1.initData("Jeon",100000);
			emp2.initData("Cheery",300000);
			emp3.initData("Aung",500000);
			
			//show info
			System.out.println("ID \tName \tSalary");
			emp1.showData();
			emp2.showData();
			emp3.showData();
			
			Employee.changeNoOfEmployee(10);
			//create 4th employee object
			var emp4 = new Employee();//occur exception
			emp4.initData("Kyaw",800000);
			emp4.showData();
			
			emp4.viewInFormation();
		}
		catch(AppException e){
			System.err.println(e.getMessage());
		}
	}
}
