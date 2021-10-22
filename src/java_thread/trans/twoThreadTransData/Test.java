package java_thread.trans.twoThreadTransData;

public class Test {
    public static void main(String[] args) {
        MyList list = new MyList();

        ThreadA threadA = new ThreadA(list);
        ThreadB threadB = new ThreadB(list);
        threadA.setName("A");
        threadB.setName("B");

        threadA.start();
        threadB.start();
    }
}
