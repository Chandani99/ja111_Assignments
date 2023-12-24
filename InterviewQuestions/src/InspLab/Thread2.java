package InspLab;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 10; i <= 200; i++) {
			System.out.println(i);
		}

	}

}
