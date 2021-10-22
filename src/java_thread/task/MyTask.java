package java_thread.task;

import java.util.TimerTask;

public class MyTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("任务执行时间为：" + System.currentTimeMillis());
    }
}
