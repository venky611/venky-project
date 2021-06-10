package Lab4_java;

public class Account {

	private int accNum;
	protected double balance;
	private String accHolder;
	protected double deposit;
	


	public Account(int accNum2, double balance2, String accHolder2, double deposit2) {
		// TODO Auto-generated constructor stub
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
		this.deposit=deposit;
	}
	public  void deposit()
	{
	
	 System.out.println("Total amout:"+balance);
		

	}
	public  void withdraw()
	{
	
	 System.out.println("Total amout:"+balance);
		

	}

}
