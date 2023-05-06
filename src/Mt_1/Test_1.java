package Mt_1;

public class Test_1 {
    public static void main(String[] args) {
         //多线程的第一种启动方式
        MyThread mt1=new MyThread();
        MyThread mt2=new MyThread();

        mt1.setName("线程1");
        mt2.setName("线程2");

        mt1.start();
        mt2.start();


    }
}
