package Mt_Example_2;

import java.util.Random;

public class MyThread extends Thread{

    static double money=100;
    static int count=3;
    static final double MIN =0.01;


    public void run(){

        synchronized (MyThread.class){
            if(count==0){
                System.out.println(getName()+"没有能抢到红包");
            }else{
                double prize=money;

                if(count==1){
                    prize=money;

                }else {
                    //随机出来一个金额
                    Random r=new Random();

                    double bounds = money - (count - 1) * MIN;
                    prize = r.nextDouble(bounds);
                    if(prize<MIN){
                        prize=MIN;
                    }
                }

                //去掉中奖的金额
                money=money-prize;
                count--;
                System.out.println(getName()+"抢到了"+prize+"dollar");
            }
        }
    }

}
