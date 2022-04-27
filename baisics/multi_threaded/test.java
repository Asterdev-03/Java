public class test implements Runnable {
    @Override
    public void run() {
        System.out.println("r1");
        System.out.println("r2");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new test());
        t.start();
        System.out.println("m1");
        t.join();
        System.out.println("m2");
    }
}