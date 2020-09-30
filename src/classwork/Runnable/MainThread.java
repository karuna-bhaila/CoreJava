package classwork.Runnable;

public class MainThread {
    public static void main(String[] args) {
        System.out.println("Main Thread Running");
        for (int i = 0; i < 50; i++) {
            System.out.println("Main Thread: " + i);

            ChildThread childThread = new ChildThread();
            Thread t1 = new Thread(childThread);
            t1.start();

            SubChildThread subChildThread = new SubChildThread();
            Thread t2 = new Thread(subChildThread);
            t2.start();
        }
    }
}
