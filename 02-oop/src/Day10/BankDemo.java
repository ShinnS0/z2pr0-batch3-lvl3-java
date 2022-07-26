package Day10;

import java.util.Scanner;

public class BankDemo extends BankAcc{
	
//	public BankDemo(int accountNo, String holderName, String password,int ping, int balance) {
//		super(accountNo, holderName, password, ping, balance);
//		
//	}

	public static void main(String[] args) {
		
		System.out.print("Do u want to create a bank account? YES OR NO: ");
		Scanner sc = new Scanner(System.in);
		var s1 = sc.nextLine();
		
		
		if(s1.equalsIgnoreCase("YES")) {
			BankAcc p1 = new BankAcc();
			p1.creatAcc();
//			System.out.println("------------------");
			p1.showData();
//			p1.initData(accountNo, holderName,  ping,  balance);
//			System.out.println("------------------");
			p1.forward();

		}else{
			System.err.println("Have a great day!");
		}
	}
}
