package Day10;

import java.time.Instant;
import java.util.Scanner;

public class BankAcc {

	//fields
	int accountNo;
	String holderName;
	String password;
	int ping;
	int balance;
	

	//constructor
	public void initData(int accountNo, String holderName, String password, int ping, int balance) {
		this.accountNo = accountNo;
		this.holderName = holderName;
		this.password = password;
		this.ping = ping;
		this.balance = balance;
	}
	
	//create Account
	public void creatAcc() {
		
		System.out.print("Enter Account NO:");
		Scanner sc = new Scanner(System.in);
		accountNo = sc.nextInt();
		
		System.out.print("Enter Holder Name:");
		Scanner sc1= new Scanner(System.in);
		holderName=sc1.nextLine();
		
		System.out.print("Enter your ping:");
		Scanner sc2= new Scanner(System.in);
		ping=sc2.nextInt();
		
		System.out.print("Enter Password:");
		Scanner sc3 = new Scanner(System.in);
		password = sc3.nextLine();
		System.out.println(" ");
	}
	
	public void showData() {
		System.out.println("----- Account Info -----\n");
		System.out.println("Account No: " + accountNo);
		System.out.println("Holder name: " + holderName);
		System.out.println("Your ping: " + ping);
		System.out.println("psw: " + password);
		System.out.println("Your balance: " + balance);
		System.out.println("-------------------\n");
	}
	
	//Option
	public void forward() {
		System.out.println("Welcome to AA bank.\n 1.Deposite\n 2.Withdrawl\n 3.ChangePsw\n 4.Show acc info\n 5.Exit");
		System.out.print("Enter option No: ");
		Scanner sc = new Scanner(System.in);
		var fw = sc.nextInt();
		
		if(fw == 1) {
			deposite();
		}else if(fw == 2) {
			withdrawl();
		}else if(fw == 3) {
			changePsw();
		}else if(fw == 4){
			showData();
			forward();
		}else if(fw == 5) {
			System.out.println("Have a great day!");
		}else {
			System.err.println("There is no option No " + fw);
		}
	}
	
	//Deposite 
	public void deposite() {
		System.out.print("How much do u want to deposite: ");
		Scanner sc = new Scanner(System.in);
		var amount = sc.nextInt();
		
		balance = amount + balance;
		System.out.println("Deposite success, current balance: " + balance);
		System.out.println("------------\n");
		forward();
	}
	
	//Withdrawl
	public void withdrawl() {
//		try{
			Scanner sc = new Scanner(System.in);
			System.out.print("How much do u want to withdrawl: ");
			var wt = sc.nextInt();
			
			if(wt <= balance ) {
				balance = balance - wt;
				System.out.println("Withdrawl success, Ur balance is: " + balance);
				System.out.println("-------------\n");
			
				}else {
				System.err.println("U have not enough balance to withdrawl!");
				System.out.println("-----------\n");
			}
			forward();
	
//			}catch(Exception e){
//				System.err.println(e.getMessage());
//			}
	}
	
	//Change password
	public void changePsw() {
		System.out.print("Please Enter your ping: ");
		Scanner sc = new Scanner(System.in);
		var new_psw = sc.nextInt();
		
		if(new_psw == ping) {
			System.out.print("Enter new password: ");
			Scanner sc1 = new Scanner(System.in);
			var newPsw = sc1.nextLine();
			password = newPsw;
			System.out.println("Succes! your password is update.");
			System.out.println("-----------\n");
			forward();
		}else {
			System.err.println("Invalid ping number! Try again");
			changePsw();
		}
	}
}