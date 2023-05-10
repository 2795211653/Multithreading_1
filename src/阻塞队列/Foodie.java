package 阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread{

    ArrayBlockingQueue<String> queue;
    public Foodie(ArrayBlockingQueue<String> queue){
        this.queue=queue;
    }

    public void run(){

        while (true){

            //将面条不断地放入阻塞队列中
            try {
                queue.put("面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }

    }
}
