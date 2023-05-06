package Mt_2;

public class MtMethod_1 {
    public static void main(String[] args) {

        //创建线程要执行的参数对象
        MyRunnable mr=new MyRunnable();

        //线程对象
        Thread td1=new Thread(mr);
        Thread td2=new Thread(mr);

        //优先级
        td1.setPriority(1);
        td2.setPriority(10);

        td1.start();
        td2.start();






    }
}
