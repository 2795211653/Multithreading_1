package Mt_2;

public class MtMethods {
    public static void main(String[] args) throws InterruptedException {

        MyThread mt1=new MyThread("欧束反馈");
        MyThread mt2=new MyThread("党风建设");
        mt1.start();
        mt2.start();

        //睡眠
        mt1.sleep(90);

        Thread td1=new Thread("到付件");
        Thread td2=new Thread("代码收到佛龛");





    }
}
