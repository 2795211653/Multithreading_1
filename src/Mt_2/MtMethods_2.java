package Mt_2;

public class MtMethods_2 {
    public static void main(String[] args) {
        //守护线程
        MyThread_p10 mt10=new MyThread_p10();
        MyThread_p100 mt100=new MyThread_p100();

        mt10.setName("地脚螺栓");
        mt100.setName("点击扣费奋达科技");

        //第二个为备胎线程，10结束了，100也就结束
        mt100.setDaemon(true);

        mt10.start();
        mt100.start();










    }
}
