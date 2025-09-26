package banking;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BankDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account acc=new Account("123456","vikki",100000);

        while (true) {
           System.out.println("1.Deposit");
           System.out.println("2.Withdraw");
           System.out.println("3.Check Balance");
           System.out.print("Enter your choice");
           try
           {
        	  int choice= sc.nextInt();
        	  switch(choice) {
        	  case 1:
        		  System.out.println("enter amount to deposit");
        		  double depositamount=sc.nextDouble();
        		  try {
        		  acc.deposit(depositamount);
        		  }
        		  catch(ArithmeticException e) {
        			  System.out.println("error"+e.getMessage());
        		  }
        		  break;
        	  case 2:
        		  System.out.println("enter the amount to be withdrawen");
        		  double withdrawamount=sc.nextDouble();
        		  try {
        		  acc.withdraw(withdrawamount);
        		  }
        		  catch(InsufficientBalanceException e){
        			  System.out.println("error:"+e.getMessage());
        		  }
        		  break;
        	  case 3:
        		  acc.showbalance();
        		  break;
        	  default:
        		  System.out.println("invalid");
        	  }
           }
           catch (InputMismatchException e) {
        	   System.out.println("error : plzz enter a number");
           }

	}

}
}