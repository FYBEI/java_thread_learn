package java_thread.trans.wait_notify.ps_rs_stack;

public class SetService {
    private Box box;

    public SetService(Box box){
        this.box = box;
    }

    public void setMethod(){
        try {
            synchronized (this){
                while (box.size() == 50){
                    System.out.println("box 已满");
                    this.wait();
                }
            }
            Thread.sleep(300);
            box.add();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void checkBoxStatus(){
        try{
            while (true){
                synchronized (this){
                    if (box.size() < 50){
                        this.notifyAll();
                    }
                }
                System.out.println("set checkBox = " + box.size());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
