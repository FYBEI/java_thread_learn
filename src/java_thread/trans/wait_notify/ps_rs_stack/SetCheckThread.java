package java_thread.trans.wait_notify.ps_rs_stack;

public class SetCheckThread extends Thread {
    private SetService setService;

    public SetCheckThread(SetService setService){
        super();
        this.setService = setService;
    }

    @Override
    public void run() {
        setService.checkBoxStatus();
    }
}
