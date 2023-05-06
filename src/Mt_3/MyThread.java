package Mt_3;

public class MyThread extends Thread{

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);

            Thread.yield();//让出CPU的执行权

        }
    }
}
