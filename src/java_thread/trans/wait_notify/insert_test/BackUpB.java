package java_thread.trans.wait_notify.insert_test;

public class BackUpB extends Thread {
    private DBTools dbTools;

    public BackUpB(DBTools dbTools){
        super();
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        dbTools.backupB();
    }
}
