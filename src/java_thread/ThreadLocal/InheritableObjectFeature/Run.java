package java_thread.ThreadLocal.InheritableObjectFeature;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        UserInfo userInfo = new UserInfo();
        System.out.println("A user: " + userInfo.hashCode());

        userInfo.setUsername("hhh");

        if (Tools.t1.get() == null){
            Tools.t1.set(userInfo);
        }
        System.out.println("  Main: " + Tools.t1.get().getUsername() + " " + userInfo.hashCode());
        Thread.sleep(100);

        ThreadA threadA = new ThreadA();
        threadA.start();
        Thread.sleep(1000);

        Tools.t1.get().setUsername("zzz");
        System.out.println("  Main: " + Tools.t1.get().getUsername() + " " + userInfo.hashCode());
    }
}
