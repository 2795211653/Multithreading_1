package Mt_Example_1;

public class MX_3 {

    public static void main(String[] args) {

        MyRunnable_3 mr = new MyRunnable_3();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
    }
