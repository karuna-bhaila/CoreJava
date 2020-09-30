package classwork.Deadlocks;

public class A {
    public synchronized void d1(B b) {
        System.out.println("Thread1 is called");
        try{
            Thread.sleep(7000);
        }
        catch (InterruptedException e){}
        System.out.println("Thread1 trying to call B's last method");
        b.last();
    }

    public synchronized void last(){
        System.out.println("Inside A, last method");
    }
}
