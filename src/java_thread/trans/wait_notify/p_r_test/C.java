package java_thread.trans.wait_notify.p_r_test;

public class C {

    private String lock;

    public C(String lock){
        super();
        this.lock = lock;
    }

    public void getValue(){
        try {
            synchronized (lock) {
                if (ValueObject.value.equals("")){
                    lock.wait();
                }
                System.out.println("get 的值时" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
