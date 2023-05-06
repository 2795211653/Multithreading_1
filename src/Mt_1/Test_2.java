package Mt_1;

public class Test_2
{
    public static void main(String[] args) {
        //第二种启动方式
        MyRnu mr=new MyRnu();

        //创建线程对象
        Thread td1=new Thread(mr);
        Thread td2=new Thread(mr);

        td1.setName("线程1");
        td1.setName("线程2");

        //开启线程
        td1.start();
        td2.start();








    }
}
