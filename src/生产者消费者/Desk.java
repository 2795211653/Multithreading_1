package 生产者消费者;

public class Desk {


    //桌子上是否有面条
    public static int foodFlag=0;

    //吃货最多可以吃多少
    public static int count=10;

    //锁对象
    public static Object lock=new Object();



}
