import java.util.Random;

class RandomNumberThread implements Runnable {
	public void run() {
		Random random = new Random();
		for (int i = 0; i < 5; i++) {
			int randomInteger = random.nextInt(100);
			System.out.println("Random Integer generated : " + randomInteger);
			if((randomInteger%2) == 0) {
				//SquareThread sThread = new SquareThread(randomInteger);
				Thread t2 = new Thread(new SquareThread(randomInteger));
				t2.start();
			}
			else {
				//CubeThread cThread = new CubeThread(randomInteger);
				Thread t3 = new Thread(new CubeThread(randomInteger));
				t3.start();
			}
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}
}

class SquareThread implements Runnable {
	int number;

	SquareThread(int randomNumbern) {
		number = randomNumbern;
	}

	public void run() {
		System.out.println("Square of " + number + " = " + (number * number));
	}
}

class CubeThread implements Runnable {
	int number;

	CubeThread(int randomNumber) {
		number = randomNumber;
	}

	public void run() {
		System.out.println("Cube of " + number + " = " + number * number * number);
	}
}

public class MultiThreadingDemo {
	public static void main(String args[]) {
		//RandomNumberThread rnThread = new RandomNumberThread();
		Thread t1 = new Thread(new RandomNumberThread());
		t1.start();
	}
}