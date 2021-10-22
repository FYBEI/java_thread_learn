package java_thread.trans.wait_notify.ps_rs_stack;

public class GetCheckThread extends Thread {
    private GetService getService;

    public GetCheckThread(GetService getService){
        super();
        this.getService = getService;
    }

    @Override
    public void run() {
        getService.checkBoxStatus();
    }
}
