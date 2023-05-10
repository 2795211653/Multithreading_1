package Mt_Example_2;

public class test {
    public static void main(String[] args) {


        MyThread mt1=new MyThread();
        MyThread mt2=new MyThread();
        MyThread mt3=new MyThread();
        MyThread mt4=new MyThread();
        MyThread mt5=new MyThread();

        mt1.setName("六点十分");
        mt2.setName("记录电风扇");
        mt3.setName("皆大欢喜");
        mt4.setName("所发生的方式");
        mt5.setName("到付件开发");

        mt1.start();
        mt2.start();
        mt3.start();
        mt4.start();
        mt5.start();



    }
}
