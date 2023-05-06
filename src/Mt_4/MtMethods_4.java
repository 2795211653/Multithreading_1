package Mt_4;

public class MtMethods_4 {
    public static void main(String[] args) throws InterruptedException {
        //插入线程

        //MyThread mt1=new MyThread();
        MyThread mt2=new MyThread();

        //mt1.setName("克里斯多夫");
        mt2.setName("房贷何况哦啥快递费");

       // mt1.start();
        mt2.start();

        //将mt2线程插入man线程之前
        mt2.join();

        for (int i = 0; i < 10; i++) {
            System.out.println("main线程："+i);
        }


    }
}
