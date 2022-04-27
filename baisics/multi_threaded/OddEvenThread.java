import java.util.Scanner;

public class OddEvenThread {
    public static void main(String[] args) {
        int limit;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit : ");
        limit = sc.nextInt();
        OddRunnable t1 = new OddRunnable(limit);
        EvenRunnable t2 = new EvenRunnable(limit);
        t1.start();
        t2.start();
    }
}

class OddRunnable extends Thread {
    int limit;

    public OddRunnable(int limit) {
        this.limit = limit;
    }

    public void run() {

        for (int even = 2; even <= limit; even += 2) {

            System.out.println("Even thread : " + even);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class EvenRunnable extends Thread {
    int limit;

    public EvenRunnable(int limit) {
        this.limit = limit;
    }

    public void run() {
        for (int odd = 1; odd <= limit; odd += 2) {
            System.out.println("Odd thread : " + odd);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}