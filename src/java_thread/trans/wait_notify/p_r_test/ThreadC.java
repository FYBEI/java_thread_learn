package java_thread.trans.wait_notify.p_r_test;

public class ThreadC extends Thread {
    private C c;

    public ThreadC(C c){
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true){
            c.getValue();
        }
    }
}
