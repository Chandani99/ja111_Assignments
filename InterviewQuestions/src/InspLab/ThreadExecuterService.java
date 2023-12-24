package InspLab;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecuterService {
	public static void main(String[] args) {
		int threadSize = 4;
		ExecutorService es = Executors.newFixedThreadPool(threadSize);
		CountDownLatch cl = new CountDownLatch(threadSize);

		es.execute(new Thread1());
		es.execute(new Thread2());
		try {
			cl.await();
			System.out.println("all threads executed");
			es.shutdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
