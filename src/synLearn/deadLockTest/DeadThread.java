package synLearn.deadLockTest;

public class DeadThread implements Runnable {

    public String username;
    public Object lock1 = new Object();
    public Object lock2 = new Object();

    public void setFlag(String username){
        this.username = username;
    }

    @Override
    public void run() {
        if (username.equals("a")){
            // 获得lock1的锁
            synchronized (lock1){
                try{
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                // 获得lock2的锁
                synchronized (lock2){
                    System.out.println("按lock1 -> lock2 代码顺序执行了");
                }
            }
        }

        if (username.equals("b")){
            // 获得lock2的锁
            synchronized (lock2){
                try{
                    System.out.println("username = " + username);
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }

                // 获得lock1的锁
                synchronized (lock1){
                    System.out.println("按lock1 -> lock2 代码顺序执行了");
                }
            }
        }
    }
}
