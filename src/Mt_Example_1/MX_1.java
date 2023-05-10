package Mt_Example_1;

public class MX_1 {
    public static void main(String[] args) {

        /*
        * 100张电影票分三个窗口卖
        * */
        MyThread_1 mt1=new MyThread_1();
        MyThread_1 mt2=new MyThread_1();
        MyThread_1 mt3=new MyThread_1();

        mt1.setName("窗口1");
        mt2.setName("窗口2");
        mt3.setName("窗口3");

        mt1.start();
        mt2.start();
        mt3.start();




















    }
}
