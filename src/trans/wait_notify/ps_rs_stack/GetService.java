package trans.wait_notify.ps_rs_stack;

public class GetService {
    private Box box;

    public GetService(Box box){
        this.box = box;
    }

    public void getMethod(){
        try {
            synchronized (this) {
                while (box.size() == 0){
                    System.out.println("box 空了");
                    this.wait();
                }
                box.popFirst();
            }
            Thread.sleep(300);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void checkBoxStatus(){
        try {
            while (true){
                synchronized (this){
                    if (box.size() > 0){
                        this.notifyAll();
                    }
                }

                System.out.println("get checkBox = " + box.size());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
