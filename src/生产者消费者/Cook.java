package 生产者消费者;

public class Cook extends Thread {

    public void run(){

        while(true){
            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else {
                    //判断桌子上是否有食物
                    if(Desk.foodFlag==1){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        System.out.println("厨师做了一碗面");
                        //没有食物
                        Desk.foodFlag=1;
                        //唤醒去吃
                        Desk.lock.notify();

                    }
                }
            }


        }


    }

}
