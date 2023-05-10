package 阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;

public class Thread {
    public static void main(String[] args) {

        //创建一个阻塞队列
        ArrayBlockingQueue<String> abq=new ArrayBlockingQueue<>(1);

        Cook c=new Cook(abq);
        Foodie f=new Foodie(abq);





    }
}
