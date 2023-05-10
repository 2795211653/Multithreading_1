package Mt_Example_1;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyRunnable_3 implements Runnable {


    static int ticket = 0;

    static Lock lock = new ReentrantLock();


    @Override
    public void run() {

        while (true) {
            lock.lock();
            //synchronized (MyRunnable_2.class){
            try {
                if (ticket == 100) {
                    break;
                } else {

                        Thread.sleep(100);
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "在卖" + ticket + "票");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }


        }
    }

}

