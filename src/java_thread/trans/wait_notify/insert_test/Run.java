package java_thread.trans.wait_notify.insert_test;

public class Run {

    public static void main(String[] args) {
        DBTools dbTools = new DBTools();

        for (int i = 0; i < 20; i++){
            BackUpB b = new BackUpB(dbTools);
            b.start();
            BackUpA a = new BackUpA(dbTools);
            a.start();
        }
    }
}
