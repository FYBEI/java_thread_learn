package Lock.await_signal;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        Service service = new Service();

        ThreadA a = new ThreadA(service);
        a.start();

        Thread.sleep(3000);
        service.signal();
    }

}
