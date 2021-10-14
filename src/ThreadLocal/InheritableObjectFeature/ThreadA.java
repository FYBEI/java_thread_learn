package ThreadLocal.InheritableObjectFeature;

public class ThreadA extends Thread {
    @Override
    public void run(){
        try {
            for (int i = 0; i < 5; i++){
                UserInfo userInfo = Tools.t1.get();
                System.out.println("ThreadA 取值：" + userInfo.getUsername() + " " + userInfo.hashCode());
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
