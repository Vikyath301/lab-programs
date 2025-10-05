package lab7;
public class Producer implements Runnable{
	 private MessageBoard board;
	 private String[] messages = {"Exam on Monday","Holiday on Tuesday","Workshop on Wednesday"};
	 public Producer(MessageBoard board) {
	    this.board = board;
	 }
	 public void run() { 
		 for(String msg:messages) {
			 board.put(msg);
			 try {
				 Thread.sleep(100);
			 }
			 catch(InterruptedException e) {
				 Thread.currentThread().interrupt();
			 }
		 }
	 }
}


