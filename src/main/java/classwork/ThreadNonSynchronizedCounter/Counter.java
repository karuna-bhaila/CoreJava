package classwork.ThreadNonSynchronizedCounter;

public class Counter {
    public int count;

    public void increment(){
        count++;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
