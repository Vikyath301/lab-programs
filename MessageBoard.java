package lab7;

public class MessageBoard {
	private String message;
	private boolean hasMessage;
	public synchronized void put(String msg) {
		while(hasMessage) {
			try {
				wait();
			}
			catch(InterruptedException e){
				Thread.currentThread().interrupt();
			}
		}
		this.message=msg;
	    hasMessage=true;
	    System.out.println("message sent by producer is"+msg);
	    notify();
	}
	public synchronized String get() {
		 while(!hasMessage) {
			 try {
				 wait();
			 }
			 catch(InterruptedException e) {
				 Thread.currentThread().interrupt();
			 }
		 }
		 hasMessage=false;
	     String msg=this.message;
	     System.out.println("Consumer reads"+msg);
	     notify();
	     return msg;
		
	}

}
