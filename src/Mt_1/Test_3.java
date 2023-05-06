package Mt_1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test_3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //第三种启动方式
        //可以获取多线程运行结果
        MyCallable mc=new MyCallable();

        //管理线程的结果
        FutureTask<Integer> ft=new FutureTask<>(mc);

        //线程对象
        //Thread td1=new Thread();
        Thread td2=new Thread();

        //td1.setName("线程1");
        td2.setName("线程2");

        //td1.start();
        td2.start();

        //获取线程运行结果
        Integer result = ft.get();
        System.out.println(result);

    }
}
