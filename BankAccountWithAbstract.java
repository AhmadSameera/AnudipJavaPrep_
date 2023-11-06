package anudip_assignment;
//creating abstract class BankAccount
abstract class BankAccount{
	int account_number;
	double balance;
	//constructor of a BankAccount.
	public BankAccount(int account_number, double balance) 
	{
		this.account_number = account_number;
		this.balance = balance;
	}
	//creating Abstract method deposit
	abstract void deposit();
	//creating Abstract method withdraw
	abstract void withdraw();
	}
//creating a child class CheckingAccount
class CheckingAccount extends BankAccount
{
	//constructor of a CheckingAccount
	public CheckingAccount(int account_number, double balance) 
	{
		super(account_number, balance);
	}
	// implementation of abstract method deposit
	void deposit() 
	{
		System.out.println("Deposit "+ balance +" in the account number "+ account_number+".");
	}
	// implementation of abstract method withdraw
	void withdraw()
	{
		System.out.println("Withdraw "+ balance +" from the account number "+ account_number+".");
	}
}
public class BankAccountWithAbstract 
{
	public static void main(String[] args) 
	{
		//creating an object of sub class and call both the abstract methods.
		CheckingAccount Check =new CheckingAccount(2023540584,1000);
		Check.deposit();
		Check.withdraw();
				
		//creating first reference variable for calling deposit method
		BankAccount ref;
		ref =new CheckingAccount(2023540584,10000.00);
		ref.deposit();
		
		//creating second reference variable for calling withdraw method 
		BankAccount ref1;
		ref1 =new CheckingAccount(2023540584,500.00);
		ref1.withdraw();
		
		
	}
}
