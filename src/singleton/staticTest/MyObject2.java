package singleton.staticTest;

public class MyObject2 {
    private static MyObject2 myObject = null;
    private MyObject2(){}

    static {
        myObject = new MyObject2();
    }

    public static MyObject2 getInstance(){
        return myObject;
    }
}
