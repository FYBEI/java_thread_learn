package trans.wait_notify.p_r_stack;

public class ThreadP extends Thread {

    private P p;

    public ThreadP(P p){
        super();
        this.p = p;
    }

    @Override
    public void run() {
        while (true){
            p.pushService();
        }
    }
}
