package trans.wait_notify;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    private static List list = new ArrayList<>();

    public static void add() {
        list.add(1);
    }

    public static int size(){
        return list.size();
    }
}
