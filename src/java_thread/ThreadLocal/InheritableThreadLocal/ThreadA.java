package java_thread.ThreadLocal.InheritableThreadLocal;

public class ThreadA extends Thread {

    @Override
    public void run(){
        try {
            System.out.println("ThreadA 继承的值 = " + Tools.t1.get());

            for (int i = 0; i < 10; i++){
                Tools.t1.set("ThreadA 添加的值 = A" + (i+1));
                System.out.println("ThreadA: " + Tools.t1.get());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
