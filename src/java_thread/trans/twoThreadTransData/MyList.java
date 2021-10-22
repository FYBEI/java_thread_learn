package java_thread.trans.twoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    volatile private List list = new ArrayList<>();

    public void add() {
        list.add(1);
    }

    public int size(){
        return list.size();
    }
}
