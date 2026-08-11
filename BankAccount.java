package PROGRAMS;
import java.util.*;
public class BankAccount {
	long AccountNo;
	String AccountHolder;
	double currentBalance;
	BankAccount(long AccountNo,String AccountHolder,double currentBalance)
	{
		this.AccountNo=AccountNo;
		this.AccountHolder=AccountHolder;
		this.currentBalance=currentBalance;
		
	}
	void Deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to deposit");
		int amount=sc.nextInt();
		if(amount>0)
		{
			currentBalance+=amount;
			System.out.println("Successfully Deposited");
		}
		else {
			System.out.println("Invalid Amount");
		}
		GetDetails();
	}
	void Withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to withdraw");
		int amount=sc.nextInt();
		if(amount<=currentBalance)
		{
			currentBalance-=amount;
			System.out.println("Withdrawal Successful");
		}
		else {
			System.out.println("Please check you balance");
		}
		GetDetails();
	}
	void GetDetails()
	{
		System.out.println("Account No:"+AccountNo+"\nAccount Holder Name:"+AccountHolder+"\nCurrent Balance:"+currentBalance);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details");
		long accNo=sc.nextLong();
		 String accHolder=sc.next();
		 double balance=sc.nextFloat();
		 BankAccount b1=new BankAccount(accNo,accHolder,balance);
		 boolean run=true;
		 while(run) {
		 System.out.println("1.Deposit");
		 System.out.println("2.Withdraw");
		 System.out.println("3.CheckBalance");
		
		 System.out.println("Enter the operation:");
		 int choose=sc.nextInt();
		 switch(choose)
		 {
		 case 1:
			 b1.Deposit();
			 break;
		 
		 case 2:
			 b1.Withdraw();
			 break;
		 case 3:
			 b1.GetDetails();
			 break;
			 default:
				 System.out.println("Please enter the Operations");
				 run=false;
				 break;
		 }
		 }
			 
		 
	}

}
