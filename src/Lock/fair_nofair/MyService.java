package Lock.fair_nofair;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    public Lock lock;

    public MyService(boolean fair){
        lock = new ReentrantLock(fair);
    }

    public void test(){
        try {
            lock.lock();
            System.out.println("test " + Thread.currentThread().getName());
            Thread.sleep(500);
            lock.unlock();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
