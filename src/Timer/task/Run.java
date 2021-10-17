package Timer.task;

import java.util.Date;
import java.util.Timer;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        long nowTime = System.currentTimeMillis();
        System.out.println("当前时间：" + nowTime);

        long scheduleTime = nowTime + 10000;
        System.out.println("计划时间：" + scheduleTime);

        MyTask task = new MyTask();

        Timer timer = new Timer();
        timer.schedule(task, new Date(scheduleTime));

        Thread.sleep(15000);

        timer.cancel();
        Thread.sleep(40000);
    }
}
