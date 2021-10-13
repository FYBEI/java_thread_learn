package trans.wait_notify.p_r_stack;

public class P {
    private MyStack myStack;

    public P (MyStack myStack){
        super();
        this.myStack = myStack;
    }

    public void pushService(){
        myStack.push();
    }
}
