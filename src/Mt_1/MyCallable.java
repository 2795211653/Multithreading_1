package Mt_1;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        int sum=0;
        for(int i=0;i<100;i++){
            sum+=i;
        }
        return sum;
    }
}