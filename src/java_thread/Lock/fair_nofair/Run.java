package java_thread.Lock.fair_nofair;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService(false);

        MyThread[] array1 = new MyThread[10];
        MyThread[] array2 = new MyThread[10];

        for (int i = 0; i < 10; i++){
            array1[i] = new MyThread(service);
            array1[i].setName("array1+++" + (i+1));
        }
        for (int i = 0; i < 10; i++){
            array1[i].start();
        }

        for (int i = 0; i < 10; i++){
            array2[i] = new MyThread(service);
            array2[i].setName("array2---" + (i+1));
        }
        Thread.sleep(500);
        for (int i = 0; i < 10; i++){
            array2[i].start();
        }
    }
}
