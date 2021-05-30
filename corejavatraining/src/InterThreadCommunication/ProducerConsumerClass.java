package InterThreadCommunication;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.Consumer;

public class ProducerConsumerClass{

	public static void main(String[] args)
	{
		BlockingQueue<Integer> bq=new LinkedBlockingQueue<Integer>();
		Producer producer=new Producer();
		
		ProducerConsumerClass consumer=new ProducerConsumerClass();

		Thread 	producerThread = new Thread();
		Thread consumerThread = new Thread();
		

     	producerThread.start();
		consumerThread.start();



	}
}
