package java_thread.Lock.await_signal;

public class ThreadA extends Thread {
    private Service service;

    public ThreadA(Service service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.await();
    }
}
