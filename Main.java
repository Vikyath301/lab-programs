package lab7;

public class Main {
	public static void main(String[] args) {
		MessageBoard board=new MessageBoard();
		Producer producer=new Producer(board);
	    Consumer consumer=new Consumer(board);
	    Thread producerThread=new Thread(producer);
	    Thread consumerThread=new Thread(consumer);
	    producerThread.start();
		consumerThread.start();
		} 
		


	}


