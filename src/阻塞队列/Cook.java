package 阻塞队列;

import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{

    ArrayBlockingQueue<String> queue;
    public Cook(ArrayBlockingQueue<String> queue){
        this.queue=queue;
    }

    public void run(){

        while (true){

            //将面条不断地放入阻塞队列中
            try {
                queue.put("面条");
                System.out.println("厨师放了一碗面条");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }



    }
}
