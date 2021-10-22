package java_thread.trans.wait_notify.p_r_stack;

public class C {
    private MyStack myStack;

    public C (MyStack myStack){
        super();
        this.myStack = myStack;
    }

    public void popService(){
        System.out.println("pop=" + myStack.pop());
    }
}
