package 生产者消费者;

public class Foodie extends Thread{
    public void run(){

        while(true){

            synchronized (Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    //判断桌子上是否有面条
                    if(Desk.foodFlag==0){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        }else{
                        Desk.count--;
                        //有面条
                        System.out.println("吃面条，还可以再吃"+Desk.count+"碗");
                        //吃完后唤醒厨师继续做
                        Desk.lock.notify();

                        Desk.foodFlag=0;
                    }


                }


            }



        }





    }
}
