package java_thread.synLearn.synLockIn_2;

public class Sub extends Main{
    synchronized public void operateSubMethod(){
        try{
            while (i > 0){
                i--;
                System.out.println("sub print i = " + i);
                Thread.sleep(100);
                super.operateMainMethod();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
