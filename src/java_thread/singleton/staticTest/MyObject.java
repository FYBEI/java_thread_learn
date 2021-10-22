package java_thread.singleton.staticTest;

public class MyObject {
    private static class MyObjectHandler {
        private static MyObject myObject = new MyObject();
    }

    private MyObject() {    }

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }
}
