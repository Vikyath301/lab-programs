package banking;

public class Account {
	private String accNo;
	private String name;
	private double balance;

	public Account(String accNo, String name, double balance) {
		this.accNo=accNo;
		this.name=name;
		this.balance=balance;
	}
	public void deposit(double amt) {
		if(amt<=0) {
			throw new ArithmeticException("amount cannot be negative");
		}
		this.balance=0;
		this.balance+=amt;
		System.out.println("updatd bank balance is"+this.balance);
	}
	public void withdraw (double amt) throws InsufficientBalanceException {
		if(amt<=0) {
			throw new ArithmeticException("amount cannot be negative");
		}
		if(amt>balance) {
			throw new InsufficientBalanceException("withdrawal amount exceeds bank value");
		}
		this.balance-=amt;
		System.out.println("Withdrawal successful and the balance after withdrawal is"+this.balance);
	}
	public void showbalance() {
		System.out.println("Account Number"+this.accNo);
	    System.out.println("Account Holder:"+this.name);
	    System.out.println("Currennt balance is "+balance);
	}
	 public double getBalance() {
         return balance;
     }
}
