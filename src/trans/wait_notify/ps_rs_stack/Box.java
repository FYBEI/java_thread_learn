package trans.wait_notify.ps_rs_stack;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private static List list = new ArrayList();

    synchronized public void add(){
        if (size() < 50){
            list.add("anyString");
            System.out.println("线程：" + Thread.currentThread().getName() + "执行add方法，size=" + size());
        }
    }

    synchronized public int size(){
        return list.size();
    }

    synchronized public Object popFirst(){
        Object value = list.remove(0);
        System.out.println("线程：" + Thread.currentThread().getName() + "执行popFirst方法，size=" + size());
        return value;
    }
}
