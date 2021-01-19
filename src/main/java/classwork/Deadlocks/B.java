package classwork.Deadlocks;

public class B {
    public synchronized void d2(A a) {
        System.out.println("Thread2 is called");
        try{
            Thread.sleep(7000);
        }
        catch (InterruptedException e){}
        System.out.println("Thread2 trying to call A's last method");
        a.last();
    }

    public synchronized void last(){
        System.out.println("Inside B, last method");
    }
}
