package Mt_1;

public class MyRnu implements Runnable{
    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            //当前进程
            Thread td = Thread.currentThread();
            System.out.println(td.getName()+"大家来看");
        }

    }
}
