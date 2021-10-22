package java_thread.trans.wait_notify.p_r_stack;

public class Run {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        P p = new P(myStack);
        C r1 = new C(myStack);
        C r2 = new C(myStack);
        C r3 = new C(myStack);
        C r4 = new C(myStack);
        C r5 = new C(myStack);

        ThreadP threadP = new ThreadP(p);
        threadP.start();

        ThreadC threadC1 = new ThreadC(r1);
        threadC1.start();
        ThreadC threadC2 = new ThreadC(r2);
        threadC2.start();
        ThreadC threadC3 = new ThreadC(r3);
        threadC3.start();
        ThreadC threadC4 = new ThreadC(r4);
        threadC4.start();
        ThreadC threadC5 = new ThreadC(r5);
        threadC5.start();
    }

}
