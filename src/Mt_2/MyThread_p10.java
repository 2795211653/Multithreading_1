package Mt_2;

public class MyThread_p10 extends Thread{
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}
