package trans.wait_notify.ps_rs_stack;

public class SetValueThread extends Thread {
    private SetService setService;

    public SetValueThread(SetService setService){
        super();
        this.setService = setService;
    }

    @Override
    public void run() {
        while (true){
            setService.setMethod();
        }
    }
}
