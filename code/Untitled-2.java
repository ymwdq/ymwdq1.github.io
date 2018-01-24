public interface CallBack {
    void doSomeThing(Caller caller);
}

public interface Caller {
    void register(CallBack callback);
    void close();
}

public class CallBackA implements CallBack {
    public void doSomeThing(Caller caller) {
        System.out.println("a do something");
        caller.close();
    }
}

public class Caller {
    private CallBack callback;
    public void register(CallBack callback) {
        this.callback = callback;
    } 

    public void doSomeThing() {
        if (this.callback != null) {
            this.callback.doSomeThing();
        }
    }
}

public class Test {
    public void main(String[] args) {
        Caller caller = new Caller();
        CallBackA callback = new CallBackA();
        caller.register(callback);
        caller.doSomeThing();
    }
}