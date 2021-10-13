package trans.wait_notify;

public class Test {
    public static void main(String[] args) {

        try {
            Object lock = new Object();

            ThreadA threadA = new ThreadA(lock);
            threadA.start();

            Thread.sleep(50);

            ThreadB threadB = new ThreadB(lock);
            threadB.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }
}
