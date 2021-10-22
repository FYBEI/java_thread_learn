package java_thread.singleton.serialize;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class MyObject implements Serializable {
    private static final long serialVersionUID = 888L;

    private static MyObject myObject = new MyObject();

    private MyObject(){}

    public static MyObject getInstance(){
        return myObject;
    }

    protected Object readResolve() throws ObjectStreamException {
        System.out.println("调用 readResolve 方法!");
        return MyObject.myObject;
    }
}
