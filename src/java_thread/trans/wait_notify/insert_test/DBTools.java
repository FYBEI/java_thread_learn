package java_thread.trans.wait_notify.insert_test;

public class DBTools {

    volatile private boolean prevIsA = false;

    synchronized public void backupA(){
        try {
            while (prevIsA == true){
                wait();
            }
            for (int i = 0; i < 5; i++){
                System.out.println("back up A");
            }
            prevIsA = true;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    synchronized public void backupB(){
        try {
            while (prevIsA == false){
                wait();
            }
            for (int i = 0; i < 5; i++){
                System.out.println("back up B");
            }
            prevIsA = false;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
