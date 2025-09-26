package banking;

public class InsufficientBalanceException extends Exception{
	private double needed;
	public InsufficientBalanceException(String message) {
		super(message);
		this.needed=needed;
		
	}
	 public double getNeededAmount() {
         return needed;
     }

}
