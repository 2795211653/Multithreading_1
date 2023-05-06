package Mt_3;

public class MtMethods_3 {
    public static void main(String[] args) {
        //出让线程
        MyThread mt1=new MyThread();
        MyThread mt2=new MyThread();

        mt1.setName("客服老师");
        mt2.setName("垦利街道都快放假");



        mt1.start();
        mt2.start();







    }
}
