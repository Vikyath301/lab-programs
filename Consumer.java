package lab7;

public class Consumer implements Runnable {
	 private MessageBoard board;

	public Consumer(MessageBoard board) {
		this.board=board;
	}
	public void run() {
		for(int i=0;i<3;i++) {
			board.get();
			 try {
				 Thread.sleep(100);
			 }
			 catch(InterruptedException e) {
				 Thread.currentThread().interrupt();
			 }  
		}
	}

}
