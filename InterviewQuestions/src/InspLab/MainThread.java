package InspLab;

public class MainThread {

	public static void main(String[] args) {
		Thread1 t1 = new Thread1();

		try {
			t1.join();
			System.out.println("thread1 is completed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Thread2 t2 = new Thread2();

		Thread th2 = new Thread(t2);
		t1.start();
		th2.start();

	}

}
