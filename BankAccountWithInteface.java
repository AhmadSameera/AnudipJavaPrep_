package anudip_assignment;
interface Bank_Account {
	 int account_number = 1205487502;
	 double balance = 20000.0;
	 void deposit();
	 void withdraw();
}
class CheckingAccount1 implements Bank_Account
{
	// implementation of abstract method deposit
	public void deposit() 
	{
		System.out.println("Deposit "+ balance +" in the account number "+ account_number+".");
	}
	// implementation of abstract method withdraw
	public void withdraw()
	{
		System.out.println("Withdraw "+ balance +" from the account number "+ account_number+".");
	}
}
public class BankAccountWithInteface {

	public static void main(String[] args) {
		
		//creating an object of sub class and call both the abstract methods.
		CheckingAccount1 Check =new CheckingAccount1();
		Check.deposit();
		Check.withdraw();
	}

}
