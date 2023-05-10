package Mt_Example_1;

public class MyThread_1 extends Thread{

    static int ticket=0;

    //锁对象是唯一的
    //static Object obj=new Object();

    public void run(){
        while(true){
            //同步代码块
            synchronized (MyThread_1.class){
                if(ticket<100){
                    try {
                        Thread.sleep(10
                        );
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName()+"正在售卖"+ticket+"张票");
                }else{
                    break;
                }

            }
    }
    }
}
