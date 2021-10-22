package java_thread.trans.wait_notify.insert_test;

public class BackUpA extends Thread {
    private DBTools dbTools;

    public BackUpA(DBTools dbTools){
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupA();
    }
}
