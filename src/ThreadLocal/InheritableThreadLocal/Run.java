package ThreadLocal.InheritableThreadLocal;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        if (Tools.t1.get() == null){
            Tools.t1.set("main 线程放入");
        }

        System.out.println("  Main: " + Tools.t1.get());

        ThreadA threadA = new ThreadA();
        threadA.start();
        Thread.sleep(5000);

        System.out.println("Thread A启动后，Main:" + Tools.t1.get());

        Tools.t1.set("Main线程放入新值");
        System.out.println("  Main: " + Tools.t1.get());
    }
}
