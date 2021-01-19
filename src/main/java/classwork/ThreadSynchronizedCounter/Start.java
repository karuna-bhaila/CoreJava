package classwork.ThreadSynchronizedCounter;

public class Start {
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    c.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++)
                    c.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join(); //main thread waits until t1 is completed
        t2.join(); //t2 runs
        System.out.println(c.count);
    }
}
