class Thread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 10; i = i + 2) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Thread1());
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}
