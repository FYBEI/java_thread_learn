package java_thread.singleton.DCL;

import java.util.Random;

public class OneInstanceService {
    public int state = 0;

    volatile private static OneInstanceService test;

    private OneInstanceService() {
        state = new Random().nextInt(200) + 1;
    }

    public static OneInstanceService getTest(){
        if (test == null){
            synchronized (OneInstanceService.class){
                if (test == null){
                    test = new OneInstanceService();
                }
            }
        }

        return test;
    }
}
