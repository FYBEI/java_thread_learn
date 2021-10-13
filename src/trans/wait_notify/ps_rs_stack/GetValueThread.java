package trans.wait_notify.ps_rs_stack;

public class GetValueThread extends Thread {
    private GetService getService;

    public GetValueThread(GetService getService){
        super();
        this.getService = getService;
    }

    @Override
    public void run() {
        while (true){
            getService.getMethod();
        }
    }
}
