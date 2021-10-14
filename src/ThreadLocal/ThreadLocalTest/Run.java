package ThreadLocal.ThreadLocalTest;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyThreadA threadA = new MyThreadA();
        MyThreadB threadB = new MyThreadB();
        threadA.start();
        threadB.start();

        for (int i = 0; i < 10; i++){
            Tools.t1.set("main " + (i+1));
            System.out.println("main get " + Tools.t1.get());
            int sleepValue = (int) (Math.random() * 1000);
            Thread.sleep(sleepValue);
        }
    }
}
