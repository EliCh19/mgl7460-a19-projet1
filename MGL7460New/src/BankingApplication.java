import java.util.Scanner;
public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount obj1 = new BankAccount("AHMED 1"," MGL7460");
		obj1.showMenu();

	}

}

class BankAccount {
	int balance;
	//amine comit test
	int previousTransaction;
	int averageAccount;
	String customerName;
	String customerId;
	
	BankAccount(String cname, String cid)
	{
		customerName = cname;
		customerId = cid;
	}
	


	void deposit (int amount)
	{
		
		if (amount !=0)
		{
			balance = balance+amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount)
	{
		if(amount !=0)
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction()
	{
		if(previousTransaction > 0)
		{
			System.out.println("Your Deposited: "+previousTransaction);
		}
	else if(previousTransaction < 0)
	{
	
		System.out.println("Withdraw: "+Math.abs(previousTransaction));
	}
	else
	{
		System.out.println("No transaction occured");
	}
}
	void getAverageAccount()
	{
		if(balance > 0)
		{
			averageAccount=balance/12;
			
			System.out.println("Your Average Account Per Year:  "+averageAccount);
		}
	else if(balance <= 0)
	{
	
		System.out.println("Your Debit Haveto Be Positive!");
	}
	
}
	void showMenu()
	{
		char option='\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("BANK ONLINE SYSTEM");
		System.out.println("Welcome Mr: "+customerName);
		System.out.println("Your ID is: "+customerId);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("V. Average Account");
		System.out.println("E. Exit");
		
		
		do
		{
			System.out.println("===========================================================================");
			System.out.println("Enter an option");
			System.out.println("===========================================================================");
			option = scanner.next().charAt(0);
			System.out.println("\n");
			
			switch(option)
			{
			case 'A':
				System.out.println("---------------------------------------");
				System.out.println("Balance = "+balance);
				System.out.println("---------------------------------------");
				System.out.println("\n");
				break;
				
			case 'B':
				System.out.println("----------------------------------------");
				System.out.println("Enter an amount to deposit");
				System.out.println("----------------------------------------");
				int amount = scanner.nextInt();
				deposit(amount);
				System.out.println("\n");
				break;
				
			case 'C':
				System.out.println("----------------------------------------");
				System.out.println("Enter an amount to withdraw");
				System.out.println("----------------------------------------");
				int amount2 = scanner.nextInt();
				withdraw(amount2);
				System.out.println("\n");
				break;
				
			case 'D':
				System.out.println("----------------------------------------");
				getPreviousTransaction();
				System.out.println("----------------------------------------");
				System.out.println("\n");
				break;
				
			case 'V':
				System.out.println("----------------------------------------");
				getAverageAccount();
				System.out.println("----------------------------------------");
				System.out.println("\n");
				break;
				
			case 'E':
				System.out.println("****************************************");
				
				default:
					System.out.println("OUPS!!!!! Invalid Option!!!!!. Please enter valid option");
					break;
			
				}	
		}
		while (option != 'E');
		
		System.out.println("Thank you for using our BANKING ONLINE SERVICE");
		System.out.println("BYE");
		
	}
}
