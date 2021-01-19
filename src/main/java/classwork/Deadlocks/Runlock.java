package classwork.Deadlocks;

public class Runlock extends Thread{
    A a = new A();
    B b = new B();

    public void m1(){
        this.start(); //calls the run method
        a.d1(b);    //calls main thread which calls A's d1 method and sleeps
    }

    public void run(){
        b.d2(a);    //calls child thread which calls B's d2 method and sleeps
    }

    public static void main(String[] args) {
        Runlock t = new Runlock();
        t.m1();
    }
}
