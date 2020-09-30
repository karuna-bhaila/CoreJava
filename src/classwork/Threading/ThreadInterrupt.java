package classwork.Threading;

public class ThreadInterrupt {
    public static void main(String[] args) {
        new Thread1("Green").start();
        new Thread1("Red").start();
    }
}

class Thread1 extends Thread{
    public Thread1(String color) {super(color);}

    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(i + " " + getName());

            try {
                sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Done " + getName());
    }
}
