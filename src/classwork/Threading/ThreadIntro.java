package classwork.Threading;

public class ThreadIntro {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println("Main Thread ID: " + mainThread.getId());
        System.out.println("Main Thread Name: " + mainThread.getName());

        //Create user thread
        Thread thread1 = new Thread();
        thread1.setName("User Thread");
        thread1.start();
        System.out.println("User Thread ID: " + thread1.getId());
        System.out.println("User Thread Name: " + thread1.getName());

        Thread thread2 = new Thread();
        thread2.setName("Karuna");
        thread2.start();
        System.out.println("User Thread ID: " + thread2.getId());
        System.out.println("User Thread Name: " + thread2.getName());
    }
}
