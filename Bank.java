package lab8;
import java.util.HashMap;
public class Bank {
	private HashMap<Integer,Double> accounts=new HashMap<>();
	public void createAccount(int accNo,double balance) {
		accounts.put(accNo, balance);
		System.out.println("creating an account with acount number"+accNo+"and balance"+balance);
	}
	public void deposit(int accNo,double amt) {
		Double currentBal=accounts.get(accNo);
		if(currentBal!=null) {
			double newbalance=currentBal+amt;
			accounts.put(accNo,newbalance);
			System.out.println("depositing amount is"+amt);
		}
	}
	public void withdraw(int accNo,double amt) {
		Double currentBal=accounts.get(accNo);
		if(currentBal>=amt) {
			double newbalance=currentBal-amt;
			accounts.put(accNo,newbalance);
			System.out.println("withdrawn amount is"+amt);
		}
		else {
			System.out.println("insufficient balance");
		}
	}
	public void checkbalance(int accNo) {
		Double balance=accounts.get(accNo);
		if(balance!=null) {
			System.out.println("account"+accNo+"have the balance"+balance+"rupees");
		}
		else {
			System.out.println("accoun not found");
		}
	}

}
