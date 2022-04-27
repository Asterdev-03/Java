import studpack.Result;

class Hybrid {
    public static void main(String[] args) {
        Result st1 = new Result("Vinayak", 35, 88.75f, 65.5f, 95);
        Result st2 = new Result("Hari", 25, 83.5f, 81, 81);
        Result st3 = new Result("Anagha", 22, 98.75f, 91, 88.75f);
        Result st4 = new Result("Edwin", 21, 81, 81, 95);
        Result st5 = new Result("Lakshmi", 22, 88.8f, 88.75f, 95);

        st1.displayTotal();
        st2.displayTotal();
        st3.displayTotal();
        st4.displayTotal();
        st5.displayTotal();
    }
}
