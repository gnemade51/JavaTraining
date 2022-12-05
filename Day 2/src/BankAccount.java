
public class BankAccount {
	private int accountid;
	private String accountname;
	private double balance;
	private double depositamt, withdrawamt;
	private static double totalbal;
	public BankAccount(int id, String name, double bal)
	{
		this.accountid = id;
		this.accountname = name;
		this.balance = bal;
		totalbal = totalbal + balance;
	}
	public void deposit(double damt)
	{
		depositamt = damt;
		this.balance = this.balance + depositamt;
		totalbal = totalbal + depositamt;
	}
	public void withdraw(double wamt)
	{
		withdrawamt = wamt;
		if (withdrawamt<=this.balance)
		{
			this.balance = this.balance - withdrawamt;
			totalbal = totalbal - withdrawamt;
		}
		else
		{
			System.out.println("Insufficient Balance!");
		}
	}
	public void displaybalance()
	{
		System.out.println("Id = "+this.accountid);
		System.out.println("Name = "+this.accountname);
		System.out.println("Balance = "+this.balance);
		System.out.println("Total Balance = "+totalbal);
	}
	public static void main(String[] args)
	{
		BankAccount b1=new BankAccount(1,"Gaurav",100000);
		b1.displaybalance();
		BankAccount b2=new BankAccount(2,"Daksh",200000);
		b2.displaybalance();
		BankAccount b3=new BankAccount(3,"Sanket",300000);
		b3.displaybalance();
		b1.deposit(150000);
		b1.displaybalance();
		b3.withdraw(50000);
		b3.displaybalance();
		b2.withdraw(300000);
		b2.displaybalance();
	}

}
