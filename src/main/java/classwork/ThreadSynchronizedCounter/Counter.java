package classwork.ThreadSynchronizedCounter;

public class Counter {
    public int count;

    public synchronized void increment(){
        count++;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
