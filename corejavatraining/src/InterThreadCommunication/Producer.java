package InterThreadCommunication;

import java.util.concurrent.BlockingDeque;

public class Producer {
	

	public class producer implements Runnable{

		
		BlockingDeque<Integer> CommonQueue;
		
		public producer(BlockingDeque<Integer> commonQueue) {
			super();
			CommonQueue = commonQueue;
		}

		@Override
		public void run() {
			for(int i=0;i<10;i++)
			{
				CommonQueue.add(i);
				System.out.println("elements are:"+i);
				System.out.println("queue elements are:"+CommonQueue);
			}
		}
			
		

	}

}
