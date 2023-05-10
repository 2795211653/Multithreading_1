package Mt_Example_1;

public class MyRunnable_2 implements Runnable{


    int ticket=0;

    @Override
    public void run() {

        while(true){
            synchronized (MyRunnable_2.class){
                if (method()) break;
            }
        }

    }

    private boolean method() {
        if(ticket==100){
            return true;
        }else{
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ticket++;
            System.out.println(Thread.currentThread().getName()+"在卖"+ticket+"票");
        }
        return false;
    }
}
