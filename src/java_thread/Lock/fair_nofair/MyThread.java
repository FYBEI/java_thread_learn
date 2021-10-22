package java_thread.Lock.fair_nofair;

public class MyThread extends Thread {
    private MyService service;

    public MyThread(MyService service){
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.test();
    }
}
