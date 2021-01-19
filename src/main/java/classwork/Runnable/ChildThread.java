package classwork.Runnable;

public class ChildThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Child running " + i);
        }
    }
}
